package com.imp.fluffy_mood.entity.pk;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class DailyLifePatternPk implements Serializable {

    @Column(name = "id", nullable = false)
    private String userId;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    public DailyLifePatternPk() {}

    public DailyLifePatternPk(String userId, LocalDate date) {
        this.userId = userId;
        this.date = date;
    }

    public String getUserId() { return userId; }
    public LocalDate getDate() { return date; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DailyLifePatternPk)) return false;
        DailyLifePatternPk that = (DailyLifePatternPk) o;
        return Objects.equals(userId, that.userId) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, date);
    }
}
