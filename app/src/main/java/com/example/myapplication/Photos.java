package com.example.myapplication;


import java.io.Serializable;

public class Photos implements Serializable {
    String url;

    public Photos(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Photos{" + "url='" + url + '\'' + '}';
    }
}


