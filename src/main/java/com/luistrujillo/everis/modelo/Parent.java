package com.luistrujillo.everis.modelo;

import javax.persistence.*;

@Entity
@Table(name = "parents")
public class Parent {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parent_id")
    private Long id;
    private String gender;
    private String firstName;
    private String middleName;
    private String lastName;
    private String otherParentDetails;

    public Parent() {}

    public Parent(String gender, String firstName, String middleName, String lastName, String otherParentDetails) {
        this.gender = gender;
        this.firstName =firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.otherParentDetails = otherParentDetails;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOtherParentDetails() {
        return otherParentDetails;
    }

    public void setOtherParentDetails(String otherParentDetails) {
        this.otherParentDetails = otherParentDetails;
    }
}
