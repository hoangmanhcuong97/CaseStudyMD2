package model;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private int password;

    public Account(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public int getPassWord() {
        return password;
    }

    public void setPassWord(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password=" + password +
                '}';
    }
}
