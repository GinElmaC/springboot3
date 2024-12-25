package com.ginelmac.springboot3.Bean;

public class Vip {
    private Integer id;
    private String name;
    private String cardNumber;
    private String birth;

    public Vip() {
    }

    public Vip(Integer id, String name, String cardNumber, String birth) {
        this.id = id;
        this.name = name;
        this.cardNumber = cardNumber;
        this.birth = birth;
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
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * 获取
     * @return birth
     */
    public String getBirth() {
        return birth;
    }

    /**
     * 设置
     * @param birth
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String toString() {
        return "Vip{id = " + id + ", name = " + name + ", cardNumber = " + cardNumber + ", birth = " + birth + "}";
    }
}
