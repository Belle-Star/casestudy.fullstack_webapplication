package com.belle-star.perscholas.model;

public interface CourseInterface {
    String getName();
    String getEmail();
    String getPassword();
    Integer getPhonenumber();

    void setName(Integer name);
    void setEmail(String email);
    void setPassword(String password);
    void setPhoneNumber(String phoneNumber);
}
