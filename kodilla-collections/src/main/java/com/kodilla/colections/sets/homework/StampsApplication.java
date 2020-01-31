package com.kodilla.colections.sets.homework;


import java.util.HashSet;

import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("smallStamp", 20, "stamped"));
        stamps.add(new Stamp("bigStamp", 40, "not available"));
        stamps.add(new Stamp("smallStamp", 20, "stamped"));
        stamps.add(new Stamp("Stamp", 30, "stamped"));
        System.out.println(stamps.size());
        for (Stamp stamp: stamps){
            System.out.println(stamp);
        }
    }
}
