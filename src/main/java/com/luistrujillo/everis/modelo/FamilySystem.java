package com.luistrujillo.everis.modelo;

import java.util.List;

public class FamilySystem {

    private List<FamilyMember> familyMembers;

    public List<FamilyMember> getFamilyMembers(Family family) {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }
}
