package com.luistrujillo.everis.modelo;

import javax.persistence.*;

@Entity
@Table(name = "families")
public class Family {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Parent headOfFamily;
    private String familyName;

    public void setHeadOfFamily(Parent headOfFamily) {
        this.headOfFamily = headOfFamily;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Parent getHeadOfFamily() {
        return headOfFamily;
    }

    public String getFamilyName() {
        return familyName;
    }
}
