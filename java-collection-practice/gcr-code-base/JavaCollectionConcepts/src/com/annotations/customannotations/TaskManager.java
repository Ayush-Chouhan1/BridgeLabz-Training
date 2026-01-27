package com.annotations.customannotations;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ayush Chouhan")
    public void completeTask() {
        System.out.println("Task completed");
    }
}