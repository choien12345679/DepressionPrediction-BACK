package com.imp.fluffy_mood.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "analysis_result")
public class AnalysisResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "analysis_result_id")
    private Long analysisResultId;

    @Column(name = "user_id", nullable = false, length = 100)
    private String userId;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "analysis_type", length = 50)
    private String analysisType;

    @Column(name = "score")
    private Double score;

    @Column(name = "confidence")
    private Double confidence;

    @Column(name = "label", length = 100)
    private String label;

    @Column(name = "comment", length = 500)
    private String comment;

    @Column(name = "model_version", length = 50)
    private String modelVersion;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        if (createdAt == null) {
            createdAt = now;
        }
        updatedAt = now;
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public Long getAnalysisResultId() { return analysisResultId; }
    public void setAnalysisResultId(Long analysisResultId) { this.analysisResultId = analysisResultId; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getAnalysisType() { return analysisType; }
    public void setAnalysisType(String analysisType) { this.analysisType = analysisType; }

    public Double getScore() { return score; }
    public void setScore(Double score) { this.score = score; }

    public Double getConfidence() { return confidence; }
    public void setConfidence(Double confidence) { this.confidence = confidence; }

    public String getLabel() { return label; }
    public void setLabel(String label) { this.label = label; }

    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }

    public String getModelVersion() { return modelVersion; }
    public void setModelVersion(String modelVersion) { this.modelVersion = modelVersion; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
