package com.ginelmac.springboot3.Bean;


public class User {
    private String name;
    private Integer age;
    private Boolean gender;
    private String desc;
    private String location;

    public User() {
    }

    public User(String name, Integer age, Boolean gender, String desc, String location) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.desc = desc;
        this.location = location;
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
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return gender
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "User{name = " + name + ", age = " + age + ", gender = " + gender + ", desc = " + desc + ", location = " + location + "}";
    }
}
