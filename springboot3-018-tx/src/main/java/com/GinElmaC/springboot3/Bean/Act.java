package com.GinElmaC.springboot3.Bean;

public class Act {
    private String actno;
    private Double balance;

    public Act() {
    }

    public Act(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    /**
     * 获取
     * @return actno
     */
    public String getActno() {
        return actno;
    }

    /**
     * 设置
     * @param actno
     */
    public void setActno(String actno) {
        this.actno = actno;
    }

    /**
     * 获取
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Act{actno = " + actno + ", balance = " + balance + "}";
    }
}
