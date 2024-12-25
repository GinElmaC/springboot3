package com.ginelmac.springboot3.Bean;

public class OuterBean {
    private String name;
    private Integer id;

    public OuterBean() {
    }

    public OuterBean(String name, Integer id) {
        this.name = name;
        this.id = id;
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
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public String toString() {
        return "OuterBean{name = " + name + ", id = " + id + "}";
    }
}
