package com.annotations.custom.annotations;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ayush Chouhan")
    public void completeTask() {
        System.out.println("Task completed");
    }
}