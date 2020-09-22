package com.github.perscholas.model;

public interface ClientInterface {
    Long getId();

    void setId(Long id);

    String getName();

    void setName(String name);

    String getEmail();

    void setEmail(String email);

    String getPassword();

    void setPassword(String password);

    Integer getPhoneNumber();

    void setPhoneNumber(Integer phoneNumber);
}
