package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> studentsNumber = new ArrayList<>();

    public School(int... studentsNumber) {
        for (int studentNumber : studentsNumber)
            this.studentsNumber.add(studentNumber);
    }

    public int getSum() {
        int sum = 0;
        for (int studentNumber : studentsNumber)
            sum += studentNumber;
        return sum;
    }

    @Override
    public String toString() {
        return "School:  "+ studentsNumber.toString();
    }

}
