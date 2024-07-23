package com.tln;

public class Task {
    private String task;
    private boolean completed;

    public Task(String task) {
        this.task = task;
        this.completed = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }
}

