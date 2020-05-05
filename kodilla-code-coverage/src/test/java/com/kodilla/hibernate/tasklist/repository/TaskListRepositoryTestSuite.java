package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    public void testFindByListName() {

        String listNameA = "ToDo";
        String listNameB = "Done";
        String listNameC = "During";

        //Given
        TaskList taskListA = new TaskList(listNameA, "Tasks to do");
        TaskList taskListB = new TaskList(listNameB, "Tasks done");
        TaskList taskListC = new TaskList(listNameC, "Tasks in during");

        //When
        taskListRepository.save(taskListA);
        taskListRepository.save(taskListB);
        taskListRepository.save(taskListC);

        //Then
        String listNames = taskListA.getListName();
        List<TaskList> readTaskList = taskListRepository.findByListName(listNameA);
        Assert.assertEquals(readTaskList.get(1).getListName(), listNameA);

        //CleanUp
        taskListRepository.deleteAll();

    }
}
