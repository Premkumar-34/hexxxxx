package com.example.recruiting_application.dto;

import java.time.LocalDate;

public class HistoryDTO {
    private Long id;
    private Long jobId;
    private String jobTitle;
    private String status;
    private Double aiScore;
    private LocalDate interviewDate;

    public HistoryDTO(Long id, Long jobId, String jobTitle, String status, Double aiScore, LocalDate interviewDate) {
        this.id = id;
        this.jobId = jobId;
        this.jobTitle = jobTitle;
        this.status = status;
        this.aiScore = aiScore;
        this.interviewDate = interviewDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getAiScore() {
        return aiScore;
    }

    public void setAiScore(Double aiScore) {
        this.aiScore = aiScore;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }
}
