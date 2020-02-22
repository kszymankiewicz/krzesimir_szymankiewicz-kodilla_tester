package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", new Teacher("John")));
        students.add(new Student("Ben", null));
        students.add(new Student("Christopher", null));

        for (Student stud : students) {
            String text= "Uczeń: ";
            text+= stud.getName();
            text += ", nauczyciel: ";
            text += Optional.ofNullable(stud.getTeacher()).map(t -> t.getName()).orElse("<undefined>");

            System.out.println(text);
        }

    }
}