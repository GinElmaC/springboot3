package com.ginelmac.springboot3.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import com.ginelmac.springboot3.Bean.User;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 这是一个消息转换器，专门用来处理yaml格式数据的
 * 所有自定义的消息转换器都必须实现HttpMessageConverter接口，或者继承AbstractHttpMessageConverter抽象类并重写方法
 */
public class YamlHttpMessageConverter extends AbstractHttpMessageConverter {
    //对象映射器
    private ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER));
    //非常重要的一部，要将媒体类型和消息转换器进行绑定
    public YamlHttpMessageConverter(){
        //                       媒体主类型      媒体子类型
        super(new MediaType("test","yaml", Charset.forName("UTF-8")));
    }

    //这个方法用来指定此消息转换器只适合于哪些类型的对象
    @Override
    protected boolean supports(Class clazz) {
        //表示只有User类型的对象才能使用此转换器
        return User.class.isAssignableFrom(clazz);
    }

    //这个是将yaml格式的字符串转换成java对象
    //相当于@RequestBody
    @Override
    protected Object readInternal(Class clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    //将java对象转换成yaml格式的字符串
    //@ResponseBody
    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        objectMapper.writeValue(outputMessage.getBody(),object);

    }
}
