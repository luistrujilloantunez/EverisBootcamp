package com.luistrujillo.everis.modelo;

import javax.persistence.*;

@Entity
@Table(name = "family_members")
public class FamilyMember {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Family family;
    private String parentOfStudentMember;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="parent_id",  nullable=true, insertable=true, updatable=true)
    private Parent parent;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="student_id", nullable=true, insertable=true, updatable=true)
    private Student student;

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setParentOrStudentMember(String parentOrStudentMember) {
        this.parentOfStudentMember = parentOfStudentMember;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Family getFamily() {
        return family;
    }

    public String getParentOfStudentMember() {
        return parentOfStudentMember;
    }

    public void setParentOfStudentMember(String parentOfStudentMember) {
        this.parentOfStudentMember = parentOfStudentMember;
    }

    public Parent getParent() {
        return parent;
    }

    public Student getStudent() {
        return student;
    }
}
