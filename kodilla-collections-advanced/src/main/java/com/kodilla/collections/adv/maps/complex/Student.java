package com.kodilla.collections.adv.maps.complex;

import java.util.Objects;

public class Student {
    private String firstname;
    private  String lastname;

    public Student(String firstname,String lastname) {
        this.lastname = lastname;
        this.firstname= firstname;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return firstname.equals(student.firstname) &&
                lastname.equals(student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
