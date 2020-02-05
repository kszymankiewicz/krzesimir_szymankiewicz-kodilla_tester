package com.kodilla.collections.adv.maps.homework;



import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> newMap = new HashMap<>();

        Principal mrBean = new Principal("Tom", "Bean");
        Principal mrTomato = new Principal("Joseph", "Tomato");
        Principal mrPotato = new Principal("John", "Potato");

        School mrBeanSchool = new School(30, 25, 31, 23, 26);
        School mrTomatoSchool = new School(21, 23, 24, 25, 27);
        School mrPotatoSchool = new School(22, 34, 24, 35, 16);


        newMap.put(mrBean, mrBeanSchool);
        newMap.put(mrTomato, mrTomatoSchool);
        newMap.put(mrPotato, mrPotatoSchool);
        System.out.println(newMap.get(mrBean));


        for (Map.Entry<Principal, School> principalSchoolEntry : newMap.entrySet())
            System.out.println("Principal: " + principalSchoolEntry.getKey().getName() + " " + principalSchoolEntry.getKey().getSurname()
                    + ", " + " school name: " + principalSchoolEntry.getValue() + " , number of student: " + +principalSchoolEntry.getValue().getSum());


    }
}
