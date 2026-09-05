package com.zhasulan.usermanagement;

public class UserRequestDTO {
    private String name;
    private String email;
    private String phone;
    private String password;
    private int age;

    public UserRequestDTO(){}
    public UserRequestDTO(String name, String email, String phone, String password, int age){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public String getPassword(){ return this.password; }
    public int getAge(){ return this.age; }

    public void setName(String name){ this.name = name; }
    public void setEmail(String email){ this.email = email; }
    public void setPhone(String phone){ this.phone = phone; }
    public void setPassword(String password){ this.password = password; }
    public void setAge(int age){ this.age = age; }
}
