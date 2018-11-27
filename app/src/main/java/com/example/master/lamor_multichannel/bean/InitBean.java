package com.example.master.lamor_multichannel.bean;

public class InitBean {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    @Override
    public String toString() {
        return "InitBean{" +
                "token='" + token + '\'' +
                '}';
    }
}
