package com.tln;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(new Task(task));
        System.out.println("Task '" + task + "' added.");
    }

    public void markTaskCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markCompleted();
            System.out.println("Task '" + tasks.get(taskIndex).getTask() + "' marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            Task deletedTask = tasks.remove(taskIndex);
            System.out.println("Task '" + deletedTask.getTask() + "' deleted.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isCompleted() ? "Completed" : "Not Completed";
                System.out.println(i + ". " + task.getTask() + " - " + status);
            }
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}

