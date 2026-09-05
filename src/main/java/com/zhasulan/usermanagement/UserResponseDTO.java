package com.zhasulan.usermanagement;

public class UserResponseDTO {
    private String name;
    private String email;
    private String phone;
    private int age;

    public UserResponseDTO(){}
    public UserResponseDTO(String name, String email, String phone, int age){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName(){ return this.name; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public int getAge(){ return this.age; }
}
