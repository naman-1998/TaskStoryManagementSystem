package com.example.taskStoryManagement.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.security.Timestamp;
import java.time.Instant;
import java.util.UUID;

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    private String title;

    @NotBlank
    private Double estimatedHours;

    @NotBlank
    private STATUS status;

    @NotBlank
    private PRIORITY priority;

    private Instant updatedAt;

    private User assignedTo;

    private Story parentStory;

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

    public Double getEstimatedHours() {
        return estimatedHours;
    }

    public void setEstimatedHours(Double estimatedHours) {
        this.estimatedHours = estimatedHours;
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

    public Story getParentStory() {
        return parentStory;
    }

    public void setParentStory(Story parentStory) {
        this.parentStory = parentStory;
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
