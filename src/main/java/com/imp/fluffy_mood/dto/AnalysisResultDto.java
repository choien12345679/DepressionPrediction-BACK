package com.imp.fluffy_mood.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.imp.fluffy_mood.entity.AnalysisResult;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AnalysisResultDto {

    @JsonProperty("analysis_result_id")
    private Long analysisResultId;

    @JsonProperty("user_id")
    private String userId;

    private LocalDate date;

    @JsonProperty("analysis_type")
    private String analysisType;

    private Double score;
    private Double confidence;
    private String label;
    private String comment;

    @JsonProperty("model_version")
    private String modelVersion;

    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;

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

    public AnalysisResult toEntity() {
        AnalysisResult entity = new AnalysisResult();
        entity.setAnalysisResultId(analysisResultId);
        entity.setUserId(userId);
        entity.setDate(date);
        entity.setAnalysisType(analysisType);
        entity.setScore(score);
        entity.setConfidence(confidence);
        entity.setLabel(label);
        entity.setComment(comment);
        entity.setModelVersion(modelVersion);
        entity.setCreatedAt(createdAt);
        entity.setUpdatedAt(updatedAt);
        return entity;
    }

    public static AnalysisResultDto fromEntity(AnalysisResult entity) {
        AnalysisResultDto dto = new AnalysisResultDto();
        dto.setAnalysisResultId(entity.getAnalysisResultId());
        dto.setUserId(entity.getUserId());
        dto.setDate(entity.getDate());
        dto.setAnalysisType(entity.getAnalysisType());
        dto.setScore(entity.getScore());
        dto.setConfidence(entity.getConfidence());
        dto.setLabel(entity.getLabel());
        dto.setComment(entity.getComment());
        dto.setModelVersion(entity.getModelVersion());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setUpdatedAt(entity.getUpdatedAt());
        return dto;
    }
}
