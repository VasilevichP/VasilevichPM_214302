package com.example.Cinesoft.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {
    @Id
    private String login;
    private String password;
    private int role;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public Account(String login, String password, int role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public Account() {
    }
}
