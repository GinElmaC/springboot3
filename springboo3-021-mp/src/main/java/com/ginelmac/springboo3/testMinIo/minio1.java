package com.ginelmac.springboo3.testMinIo;

import io.minio.*;
import io.minio.errors.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Component
@ConfigurationProperties(prefix = "minio")
public class minio1 {
    //定义minio所需要的内容
    private static String endpoint;
    private static String accessKey;
    private static String secretKey;
    private static String bucketName;
    //利用@ConfigurationProperties注解进行注入的时候需要调用相应的set方法
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public void saveDD(String objectURL, String objectname){
        //获取对minio操作的对象
        MinioClient minioClient = MinioClient.builder().endpoint(endpoint).credentials(accessKey,secretKey).build();
        try {
            //判断这个桶有没有，如果没有，则新建
            if(!minioClient.bucketExists(BucketExistsArgs.builder().bucket(bucketName).build())){
                //新建桶
                minioClient.makeBucket(MakeBucketArgs.builder().bucket(bucketName).build());
                //用三引号的好处：可以保留字符串的格式，怎么输入的就怎么输出
                String policy = """
                        {
                          "Statement" : [ {
                            "Action" : "s3:GetObject",
                            "Effect" : "Allow",
                            "Principal" : "*",
                            "Resource" : "arn:aws:s3:::%s/*"
                          } ],
                          "Version" : "2012-10-17"
                        }""".formatted(bucketName);
                //配置这个桶的权限为管理员可读写，其他人只读
                minioClient.setBucketPolicy(SetBucketPolicyArgs.builder().bucket(bucketName).config(policy).build());
            }
            //将对象上传
            minioClient.uploadObject(UploadObjectArgs.builder().bucket(bucketName).filename(objectURL).object(objectname).build());
            System.out.println("上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
