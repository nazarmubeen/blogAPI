package com.blogapi.blog.model;

import javax.persistence.*;

@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="user")
    private  String name;

    @Column(name="email")
    private String email;

    @Column(name="additional_details")
    private String additional_details;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", additional_details='" + additional_details + '\'' +
                '}';
    }
}
