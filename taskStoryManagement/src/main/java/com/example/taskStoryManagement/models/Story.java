package com.example.taskStoryManagement.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


import java.security.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public class Story {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotNull
    private int storyPoints;

    @NotBlank
    private STATUS status;

    @NotBlank
    private PRIORITY priority;

    @NotNull
    private Instant createdAt;

    private Instant updatedAt;

    private User assignedTo;

    private List<Task> childTasks;

    private Task parentTask;

    private Timestamp expectedStartDateTime;

    private Timestamp expectedEndDateTime;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(int storyPoints) {
        this.storyPoints = storyPoints;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public PRIORITY getPriority() {
        return priority;
    }

    public void setPriority(PRIORITY priority) {
        this.priority = priority;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public List<Task> getChildTasks() {
        return childTasks;
    }

    public void setChildTasks(List<Task> childTasks) {
        this.childTasks = childTasks;
    }

    public Task getParentTask() {
        return parentTask;
    }

    public void setParentTask(Task parentTask) {
        this.parentTask = parentTask;
    }

    public Timestamp getExpectedStartDateTime() {
        return expectedStartDateTime;
    }

    public void setExpectedStartDateTime(Timestamp expectedStartDateTime) {
        this.expectedStartDateTime = expectedStartDateTime;
    }

    public Timestamp getExpectedEndDateTime() {
        return expectedEndDateTime;
    }

    public void setExpectedEndDateTime(Timestamp expectedEndDateTime) {
        this.expectedEndDateTime = expectedEndDateTime;
    }
}
