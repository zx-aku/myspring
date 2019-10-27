package com.aku.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer id;
    private String name;
    private String id_card;
    private String cell;
    private String address;
    private String username;
    private String password;
    private Date registration_data;

    public User() {
    }

    public User(Integer id, String name, String id_card, String cell, String address, String username, String password, Date registration_data) {
        this.id = id;
        this.name = name;
        this.id_card = id_card;
        this.cell = cell;
        this.address = address;
        this.username = username;
        this.password = password;
        this.registration_data = registration_data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistration_data() {
        return registration_data;
    }

    public void setRegistration_data(Date registration_data) {
        this.registration_data = registration_data;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id_card='" + id_card + '\'' +
                ", cell='" + cell + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", registration_data=" + registration_data  +
                '}';
    }
}
