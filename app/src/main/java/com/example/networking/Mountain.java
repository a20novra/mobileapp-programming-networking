package com.example.networking;

public class Mountain<string> {
    private String name;
    private int height;
    private String description;


    public Mountain(String name, int height, String description){
        this.name = name;
        this.height = height;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public String getDescription(){
        return description;
    }


    @Override
    public String toString(){
        return name;
    }





}
