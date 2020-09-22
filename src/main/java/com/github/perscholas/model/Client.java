package com.belle-star.perscholas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;

@Entity
public class Client implements ClientInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Integer phonenumber;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Overrde
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Overrde
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Integer getPhonenumber() {
        return phonenumber;
    }

    @Overrde
    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }
}