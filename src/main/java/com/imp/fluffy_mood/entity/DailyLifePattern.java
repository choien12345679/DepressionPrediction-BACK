package com.imp.fluffy_mood.entity;

import com.imp.fluffy_mood.entity.pk.DailyLifePatternPk;
import jakarta.persistence.*;

@Entity
@Table(name = "daily_life_pattern")
public class DailyLifePattern {

    @EmbeddedId
    private DailyLifePatternPk pk;

    @Column(name = "activity_score")
    private Double activityScore;

    @Column(name = "circadian_rhythm_score")
    private Double circadianRhythmScore;

    @Column(name = "day_call_use_duration")
    private Double dayCallUseDuration;

    @Column(name = "day_call_use_frequency")
    private Double dayCallUseFrequency;

    @Column(name = "day_light_exposure")
    private Double dayLightExposure;

    @Column(name = "day_phone_use_duration")
    private Double dayPhoneUseDuration;

    @Column(name = "day_phone_use_frequency")
    private Double dayPhoneUseFrequency;

    @Column(name = "day_step_count")
    private Double dayStepCount;

    @Column(name = "day_time_count")
    private Double dayTimeCount;

    @Column(name = "home_stay_percentage")
    private Double homeStayPercentage;

    @Column(name = "illumination_exposure_score")
    private Double illuminationExposureScore;

    @Column(name = "life_routine_consistency")
    private Double lifeRoutineConsistency;

    @Column(name = "location_diversity_score")
    private Double locationDiversityScore;

    @Column(name = "night_call_use_duration")
    private Double nightCallUseDuration;

    @Column(name = "night_call_use_frequency")
    private Double nightCallUseFrequency;

    @Column(name = "night_light_exposure")
    private Double nightLightExposure;

    @Column(name = "night_phone_use_duration")
    private Double nightPhoneUseDuration;

    @Column(name = "night_phone_use_frequency")
    private Double nightPhoneUseFrequency;

    @Column(name = "night_step_count")
    private Double nightStepCount;

    @Column(name = "night_time_count")
    private Double nightTimeCount;

    @Column(name = "phone_usage_score")
    private Double phoneUsageScore;

    @Column(name = "place_diversity")
    private Double placeDiversity;

    public DailyLifePatternPk getPk() { return pk; }
    public void setPk(DailyLifePatternPk pk) { this.pk = pk; }

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

    public Double getDayTimeCount() { return dayTimeCount; }
    public void setDayTimeCount(Double dayTimeCount) { this.dayTimeCount = dayTimeCount; }

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

    public Double getNightTimeCount() { return nightTimeCount; }
    public void setNightTimeCount(Double nightTimeCount) { this.nightTimeCount = nightTimeCount; }

    public Double getPhoneUsageScore() { return phoneUsageScore; }
    public void setPhoneUsageScore(Double phoneUsageScore) { this.phoneUsageScore = phoneUsageScore; }

    public Double getPlaceDiversity() { return placeDiversity; }
    public void setPlaceDiversity(Double placeDiversity) { this.placeDiversity = placeDiversity; }
}