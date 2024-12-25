package com.ginelmac.springboot3.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "group")
//用这个注解来指定数据来源
@PropertySource("classpath:/a/b/group-info.properties")
public class Group {
    private String name;
    private String leader;
    private Integer count;

    public Group() {
    }

    public Group(String name, String leader, Integer count) {
        this.name = name;
        this.leader = leader;
        this.count = count;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return leader
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置
     * @param leader
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    public String toString() {
        return "Group{name = " + name + ", leader = " + leader + ", count = " + count + "}";
    }
}
