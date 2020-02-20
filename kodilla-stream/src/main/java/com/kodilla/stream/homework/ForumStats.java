package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgAge = UsersRepository.getUsersList()
                .stream()
                .filter(u->u.equals(u.getAge()>=40))
                .map(user-> user.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();

        double avAge2  = UsersRepository.getUsersList()
                .stream()
                .filter(u->u.equals(u.getAge()<40))
                .map(user-> user.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .getAsDouble();

        System.out.println("Average post >=40: " + avgAge+ "Average post under 40: "+avAge2);
    }
}
