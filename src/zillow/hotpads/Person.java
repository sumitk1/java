package com.zillow.hotpads;

import java.util.Date;

public class Person {

    private String ssn;
    private Date dateOfBirth;
    private String firstName;
    private String lastName;
    private Double heightIn;
    private Double weightLb;

    Person(String ssn, Date dateOfBirth, String firstName, String lastName, Double heightIn, Double weightLb){
        this.setSsn(ssn);
        this.setDateOfBirth(dateOfBirth);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeightIn(heightIn);
        this.setWeightLb(weightLb);
    }

    @Override
    public String toString(){
        return  "SSN - " + this.getSsn() +
                ", DOB - " + this.getDateOfBirth() +
                ", fname - " + this.getFirstName() +
                ", lname - " + this.getLastName() +
                ", height - " + this.getHeightIn() +
                ", weight - " + this.getWeightLb();
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getHeightIn() {
        return heightIn;
    }

    public void setHeightIn(Double heightIn) {
        this.heightIn = heightIn;
    }

    public Double getWeightLb() {
        return weightLb;
    }

    public void setWeightLb(Double weightLb) {
        this.weightLb = weightLb;
    }

}

