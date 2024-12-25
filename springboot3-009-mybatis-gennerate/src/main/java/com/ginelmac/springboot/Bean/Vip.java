package com.ginelmac.springboot.Bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_vip
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vip implements Serializable {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

    public Vip(String name, String birth, String cardNumber) {
        this.name = name;
        this.birth = birth;
        this.cardNumber = cardNumber;
    }

    private static final long serialVersionUID = 1L;
}