package com.GinElmaC.lombok.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//lombok中的无参构造方法注解
@NoArgsConstructor
//lombok中的全参数构造方法注解
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
    private String password;
}
