package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2020,02,12);
        List<LocalDate> deadlines = TaskRepository.getTask()
                .stream()
                .filter(u -> u.getDeadline().equals(u > currentDate))
                .map(TaskManager::getDeadLine)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }

    public static LocalDate getDeadLine(Task task) {
        return task.getDeadline();
    }
}
