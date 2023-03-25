package com.example.petinfo.model;

public class Pet {

    private String petName;
    private String petType;



    public Pet(String petName,String petType){
        this.petName = petName;
        this.petType = petType;
    }

    public String getPetName(){
        return petName;
    }
    public String getPetType(){
        return petType;
    }


    public void setPetName(String petName){
        this.petName = petName;
    }
    public void setPetType(String petType){
        this.petType = petName;
    }


}
