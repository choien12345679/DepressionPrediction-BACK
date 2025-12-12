package com.imp.fluffy_mood.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class DailyLifePatternDto {
    @JsonProperty("user_id")
    private String userId;
    private LocalDate date;

    @JsonProperty("activity_score")
    private Double activityScore;
    @JsonProperty("circadian_rhythm_score")
    private Double circadianRhythmScore;

    @JsonProperty("day_call_use_duration")
    private Double dayCallUseDuration;
    @JsonProperty("day_call_use_frequency")
    private Double dayCallUseFrequency;
    @JsonProperty("day_light_exposure")
    private Double dayLightExposure;
    @JsonProperty("day_phone_use_duration")
    private Double dayPhoneUseDuration;
    @JsonProperty("day_phone_use_frequency")
    private Double dayPhoneUseFrequency;
    @JsonProperty("day_step_count")
    private Double dayStepCount;
    @JsonProperty("day_time_count")
    private Integer dayTimeCount;

    @JsonProperty("home_stay_percentage")
    private Double homeStayPercentage;
    @JsonProperty("illumination_exposure_score")
    private Double illuminationExposureScore;
    @JsonProperty("life_routine_consistency")
    private Double lifeRoutineConsistency;
    @JsonProperty("location_diversity_score")
    private Double locationDiversityScore;

    @JsonProperty("night_call_use_duration")
    private Double nightCallUseDuration;
    @JsonProperty("night_call_use_frequency")
    private Double nightCallUseFrequency;
    @JsonProperty("night_light_exposure")
    private Double nightLightExposure;
    @JsonProperty("night_phone_use_duration")
    private Double nightPhoneUseDuration;
    @JsonProperty("night_phone_use_frequency")
    private Double nightPhoneUseFrequency;
    @JsonProperty("night_step_count")
    private Double nightStepCount;
    @JsonProperty("night_time_count")
    private Integer nightTimeCount;

    @JsonProperty("phone_usage_score")
    private Double phoneUsageScore;
    @JsonProperty("place_diversity")
    private Double placeDiversity;

    // 프런트 요구에 따라 정수 라벨(0/1 등)로 전달
    private Integer label;

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public Double getActivityScore() { return activityScore; }
    public void setActivityScore(Double activityScore) { this.activityScore = activityScore; }

    public Double getCircadianRhythmScore() { return circadianRhythmScore; }
    public void setCircadianRhythmScore(Double circadianRhythmScore) { this.circadianRhythmScore = circadianRhythmScore; }

    public Double getDayCallUseDuration() { return dayCallUseDuration; }
    public void setDayCallUseDuration(Double dayCallUseDuration) { this.dayCallUseDuration = dayCallUseDuration; }

    public Double getDayCallUseFrequency() { return dayCallUseFrequency; }
    public void setDayCallUseFrequency(Double dayCallUseFrequency) { this.dayCallUseFrequency = dayCallUseFrequency; }

    public Double getDayLightExposure() { return dayLightExposure; }
    public void setDayLightExposure(Double dayLightExposure) { this.dayLightExposure = dayLightExposure; }

    public Double getDayPhoneUseDuration() { return dayPhoneUseDuration; }
    public void setDayPhoneUseDuration(Double dayPhoneUseDuration) { this.dayPhoneUseDuration = dayPhoneUseDuration; }

    public Double getDayPhoneUseFrequency() { return dayPhoneUseFrequency; }
    public void setDayPhoneUseFrequency(Double dayPhoneUseFrequency) { this.dayPhoneUseFrequency = dayPhoneUseFrequency; }

    public Double getDayStepCount() { return dayStepCount; }
    public void setDayStepCount(Double dayStepCount) { this.dayStepCount = dayStepCount; }

    public Integer getDayTimeCount() { return dayTimeCount; }
    public void setDayTimeCount(Integer dayTimeCount) { this.dayTimeCount = dayTimeCount; }

    public Double getHomeStayPercentage() { return homeStayPercentage; }
    public void setHomeStayPercentage(Double homeStayPercentage) { this.homeStayPercentage = homeStayPercentage; }

    public Double getIlluminationExposureScore() { return illuminationExposureScore; }
    public void setIlluminationExposureScore(Double illuminationExposureScore) { this.illuminationExposureScore = illuminationExposureScore; }

    public Double getLifeRoutineConsistency() { return lifeRoutineConsistency; }
    public void setLifeRoutineConsistency(Double lifeRoutineConsistency) { this.lifeRoutineConsistency = lifeRoutineConsistency; }

    public Double getLocationDiversityScore() { return locationDiversityScore; }
    public void setLocationDiversityScore(Double locationDiversityScore) { this.locationDiversityScore = locationDiversityScore; }

    public Double getNightCallUseDuration() { return nightCallUseDuration; }
    public void setNightCallUseDuration(Double nightCallUseDuration) { this.nightCallUseDuration = nightCallUseDuration; }

    public Double getNightCallUseFrequency() { return nightCallUseFrequency; }
    public void setNightCallUseFrequency(Double nightCallUseFrequency) { this.nightCallUseFrequency = nightCallUseFrequency; }

    public Double getNightLightExposure() { return nightLightExposure; }
    public void setNightLightExposure(Double nightLightExposure) { this.nightLightExposure = nightLightExposure; }

    public Double getNightPhoneUseDuration() { return nightPhoneUseDuration; }
    public void setNightPhoneUseDuration(Double nightPhoneUseDuration) { this.nightPhoneUseDuration = nightPhoneUseDuration; }

    public Double getNightPhoneUseFrequency() { return nightPhoneUseFrequency; }
    public void setNightPhoneUseFrequency(Double nightPhoneUseFrequency) { this.nightPhoneUseFrequency = nightPhoneUseFrequency; }

    public Double getNightStepCount() { return nightStepCount; }
    public void setNightStepCount(Double nightStepCount) { this.nightStepCount = nightStepCount; }

    public Integer getNightTimeCount() { return nightTimeCount; }
    public void setNightTimeCount(Integer nightTimeCount) { this.nightTimeCount = nightTimeCount; }

    public Double getPhoneUsageScore() { return phoneUsageScore; }
    public void setPhoneUsageScore(Double phoneUsageScore) { this.phoneUsageScore = phoneUsageScore; }

    public Double getPlaceDiversity() { return placeDiversity; }
    public void setPlaceDiversity(Double placeDiversity) { this.placeDiversity = placeDiversity; }

    public Integer getLabel() { return label; }
    public void setLabel(Integer label) { this.label = label; }
}
