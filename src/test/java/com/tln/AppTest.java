package com.tln;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    ToDoList toDoList;

    @BeforeEach
    void setUp() {
        toDoList = new ToDoList();
        // TODO apply these precondition in tests
    }

    @Test
    public void testAddTask() {
        ToDoList toDoList = new ToDoList();
        // TODO: improve to avoid repetition
        toDoList.addTask("Test Task");
        assertThat(toDoList.getTasks()).hasSize(1);
        assertThat(toDoList.getTasks().get(0).getTask()).isEqualTo("Test Task");
    }

    @Test
    public void testMarkTaskCompleted() {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Test Task");
        toDoList.markTaskCompleted(0);
        assertThat(toDoList.getTasks().get(0).isCompleted()).isTrue();
    }

    @Test
    public void testDeleteTask() {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Test Task");
        toDoList.deleteTask(0);
        assertThat(toDoList.getTasks().size()).isEqualTo(0);
    }

    @Test
    public void testDeleteNonExistingTask() {
        // TODO
    }

    @Test
    public void testDisplayTasks() {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Task 1");
        toDoList.addTask("Task 2");
        toDoList.markTaskCompleted(1);

        // TODO: complete
//        assertThat(toDoList.getTasks().size()).isEqualTo( ? );
//        assertThat(toDoList.getTasks().get(0).isCompleted()).isFalse();
//        assertThat(toDoList.getTasks().get(1).isCompleted()).is ?
    }
}
