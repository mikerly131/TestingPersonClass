package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;
    private int height;
    private String ssn;
    private String eyeColor;
    private String birthState;
    private Boolean alive;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
        this.height = 0;
        this.ssn = "NNN-NN-NNNN";
        this.eyeColor = "";
        this.birthState = "";
        this.alive = true;

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //Setters...
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
    public void setSSN(String newSSN) {
        this.name = newSSN;
    }
    public void setEyeColor(String newEyeColor) {
        this.eyeColor = newEyeColor;
    }
    public void setBirthState(String newBirthState) {
        this.birthState = newBirthState;
    }
    public void setAliveStatus(Boolean newAliveStatus) {
        this.alive = newAliveStatus;
    }

    // Getters...
    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }
    public Integer getHeight() {
        return this.height;
    }
    public String getSSN() {
        return this.ssn;
    }
    public String getEyeColor() {
        return this.eyeColor;
    }
    public String getBirthState() {
        return this.birthState;
    }
    public Boolean getAliveStatus() {
        return this.alive;
    }

}
