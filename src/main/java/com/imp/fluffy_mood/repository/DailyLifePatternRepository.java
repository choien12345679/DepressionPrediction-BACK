package com.imp.fluffy_mood.repository;

import com.imp.fluffy_mood.entity.DailyLifePattern;
import com.imp.fluffy_mood.entity.pk.DailyLifePatternPk;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DailyLifePatternRepository extends JpaRepository<DailyLifePattern, DailyLifePatternPk> {

    // EmbeddedId 안의 필드로 접근: pk.userId / pk.date
    Optional<DailyLifePattern> findByPkUserIdAndPkDate(String userId, LocalDate date);

    List<DailyLifePattern> findByPkUserIdOrderByPkDateDesc(String userId);
}
