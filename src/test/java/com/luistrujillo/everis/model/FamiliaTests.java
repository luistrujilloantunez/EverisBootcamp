package com.luistrujillo.everis.model;

//import org.junit.Test;

import com.luistrujillo.everis.modelo.Family;
import com.luistrujillo.everis.modelo.FamilyMember;
import com.luistrujillo.everis.modelo.FamilySystem;
import com.luistrujillo.everis.modelo.Parent;
import com.luistrujillo.everis.modelo.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertEquals;

public class FamiliaTests {

	
/**	
	@Test
    public void deberiaObtenerFamilyMembers(){


        Parent jose = new Parent("MASCULINO", "Jose", "Amadeo", "Diaz", "Programador");
        Parent miryan = new Parent("FEMENINO", "Miryan", "Amelia", "Ramirez", "Consultora");

        List<Parent> parents = new ArrayList<>();
        parents.add(jose);
        parents.add(miryan);

        Student elias = new Student("MASCULINO", "Elias", "Jose", "Diaz",
                LocalDate.of(2005, 10, 17), "Natacion");
        Student felipe = new Student("MASCULINO", "Felipe", "Andres", "Diaz",
                LocalDate.of(2007, 11, 01), "Piano");
        Student deborah = new Student("FEMENINO", "Deborah", "Sofia", "Diaz",
                LocalDate.of(2009, 02, 15), "Canto");



       // elias.setParents(parents);
       // felipe.setParents(parents);
       // deborah.setParents(parents);

        Family family = new Family();
        family.setHeadOfFamily(jose);
        family.setFamilyName("DIAZ RAMIREZ");

        FamilyMember familyMember1 = new FamilyMember();
        familyMember1.setFamily(family);
        familyMember1.setParentOrStudentMember("PARENT");
        familyMember1.setParent(jose);

        FamilyMember familyMember2 = new FamilyMember();
        familyMember2.setFamily(family);
        familyMember2.setParentOrStudentMember("PARENT");
        familyMember2.setParent(miryan);

        FamilyMember familyMember3= new FamilyMember();
        familyMember3.setFamily(family);
        familyMember3.setParentOrStudentMember("STUDENT");
        familyMember3.setStudent(elias);

        FamilyMember familyMember4= new FamilyMember();
        familyMember4.setFamily(family);
        familyMember4.setParentOrStudentMember("STUDENT");
        familyMember4.setStudent(felipe);

        FamilyMember familyMember5= new FamilyMember();
        familyMember5.setFamily(family);
        familyMember5.setParentOrStudentMember("STUDENT");
        familyMember5.setStudent(deborah);

        List<FamilyMember> familyMembers = new ArrayList<>();
        familyMembers.add(familyMember1);
        familyMembers.add(familyMember2);
        familyMembers.add(familyMember3);
        familyMembers.add(familyMember4);
        familyMembers.add(familyMember5);




        //asserts

        FamilySystem familySystem = new FamilySystem();
        familySystem.setFamilyMembers(familyMembers);



        assertEquals(5, familySystem.getFamilyMembers(family).size());

    }
	
	
	
	**/
	
}
