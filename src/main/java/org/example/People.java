package org.example;

public class People {
    private String name, email,password;
    private int age;
    private String location;

    public People(String name, String email, String password, int age, String location) {
        this.name = name;
        this.email = CheckEmail.checkEmail(email)?email:null;
        this.password = CheckPassword.checkPassword(password)?password:null;
        this.age = age;
        this.location = location;
    }
}
