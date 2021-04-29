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

    public String getName(String name){
        return this.name;
    }

    public int getHeight(String height){
        return this.height;
    }

    public String getDescription(String description){
        return this.description;
    }


    @Override
    public String toString(){
        return name;
    }





}
