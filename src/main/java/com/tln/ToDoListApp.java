package com.tln;

import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Delete Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter the task number to mark as completed: ");
                    int taskIndexToComplete = scanner.nextInt();
                    toDoList.markTaskCompleted(taskIndexToComplete);
                    break;
                case 3:
                    System.out.print("Enter the task number to delete: ");
                    int taskIndexToDelete = scanner.nextInt();
                    toDoList.deleteTask(taskIndexToDelete);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

