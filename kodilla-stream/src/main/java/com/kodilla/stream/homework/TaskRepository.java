package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Walking",LocalDate.of(2019,12,10),LocalDate.of(2019,12,12));
        tasks.add(new Task("Running",LocalDate.of(2020,01,14),LocalDate.of(2020,02,12));
        tasks.add(new Task("Jumping",LocalDate.of(2020,03,11),LocalDate.of(2020,03,03));

        return tasks;
    }


}
