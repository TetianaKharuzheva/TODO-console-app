package com.tln;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    public void testAddTask() {
        String nameTask = "Test Task";
        toDoList.addTask(nameTask);
        assertThat(toDoList.getTasks()).hasSize(1);
        assertThat(toDoList.getTasks().get(0).getTask()).isEqualTo(nameTask);
    }

    @Test
    public void testMarkTaskCompleted() {
        toDoList.addTask("Test Task");
        toDoList.markTaskCompleted(0);
        assertThat(toDoList.getTasks().get(0).isCompleted()).isTrue();
    }

    @Test
    public void testDeleteTask() {
        toDoList.addTask("Test Task");
        toDoList.deleteTask(0);
        assertThat(toDoList.getTasks().size()).isEqualTo(0);
    }


    @Test
    public void testDeleteNonExistingTask() {
        toDoList.addTask("Play game");
        toDoList.addTask("Go home");
        assertThat(toDoList.getTasks().size()).isEqualTo(2);
        toDoList.deleteTask(5);
        assertThat(toDoList.getTasks().size()).isEqualTo(2);
    }

    @Test
    public void testDisplayTasks() {
        toDoList.addTask("Task 1");
        toDoList.addTask("Task 2");
        toDoList.markTaskCompleted(1);
        assertThat(toDoList.getTasks().size()).isEqualTo(2);
        assertThat(toDoList.getTasks().get(0).isCompleted()).isFalse();
        assertThat(toDoList.getTasks().get(1).isCompleted()).isTrue();
    }
}
