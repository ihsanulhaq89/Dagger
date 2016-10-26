package com.example.ihsan.daggerdemoapp.models;


public class Carousel {
    String name;
    String info;
    String data;

    public Carousel(String name, String info, String data) {
        this.name = name;
        this.info = info;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Carousel{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
