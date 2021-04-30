package com.company;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;

    public User() {

    }

    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("name surname : " + name + " " + lastName);
        this.email = email;
        this.password = password;
    }
    public void showInfo(){
        System.out.println("--------INFO--------");
        System.out.println("DISPLAY NAME: " + name + " " + lastName );
        System.out.println("EMAİL: " + email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

