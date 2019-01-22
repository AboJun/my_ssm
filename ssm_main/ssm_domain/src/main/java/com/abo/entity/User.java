package com.abo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class User {
    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
}
