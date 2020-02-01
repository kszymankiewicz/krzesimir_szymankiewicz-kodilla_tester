package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher() {
        super("Arek");
    }

    @Override
    public void personResponsibilities() {
        String[] responsibilities = new String[4];
        responsibilities[0] = "Planning and conducting experiments.";
        responsibilities[1] = "Recording and analysing data.";
        responsibilities[2] = "carrying out fieldwork, eg collecting samples.";
        responsibilities[3] = "writing research papers, reports, reviews and summaries.";
        System.out.println(getFirstName() + " is a teacher with responsibility: ");

        for (int i = 0; i < responsibilities.length; i++) {

            System.out.println(responsibilities[i]);
        }

    }


}


