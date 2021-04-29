package com.example.networking;

public class Mountain<string> {
    private String name;
    private int height;
    private String description;
    private double admissionFee;


    public Mountain(String name, int height, String description, double admissionFee){
        this.name = name;
        this.height = height;
        this.description = description;
        this.admissionFee = admissionFee;
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
    public double getAdmissionFee(){
        return admissionFee;
    }

    @Override
    public String toString(){
        return name + " " + admissionFee;
    }





}
