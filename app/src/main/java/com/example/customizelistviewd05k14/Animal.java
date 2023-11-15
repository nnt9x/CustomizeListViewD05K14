package com.example.customizelistviewd05k14;

public class Animal {
    private int id;
    private String name;
    private String url;
    private String description;

    public Animal(){}

    public Animal(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Animal(int id, String name, String url, String description) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
