package com.GinElmaC.testBuilder;

public class User {
    //一般建造模式的Bean属性值用final修饰，外部类方法只有get，没有set
    private final String name;
    private final String email;
    private final Integer age;

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    public String toString() {
        return "User{name = " + name + ", email = " + email + ", age = " + age + "}";
    }

    //内部建造类
    public static class UserBuilder{
        private String name;
        private String email;
        private Integer age;
        public static UserBuilder getBuilder(){
            return new UserBuilder();
        }
        public UserBuilder name(String name){
            this.name = name;
            return this;
        }
        public UserBuilder age(Integer age){
            this.age = age;
            return this;
        }
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }
        public User build(){
            return new User(name,email,age);
        }
    }
}
