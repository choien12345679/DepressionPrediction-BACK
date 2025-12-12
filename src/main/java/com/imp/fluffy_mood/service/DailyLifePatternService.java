package com.imp.fluffy_mood.service;

import com.imp.fluffy_mood.dto.DailyLifePatternDto;
import com.imp.fluffy_mood.dto.DailyLifePatternInferenceDto;
import com.imp.fluffy_mood.entity.DailyLifePattern;
import com.imp.fluffy_mood.entity.converter.DailyLifePatternConverter;
import com.imp.fluffy_mood.repository.DailyLifePatternRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DailyLifePatternService {

    private final DailyLifePatternRepository repository;

    public DailyLifePatternService(DailyLifePatternRepository repository) {
        this.repository = repository;
    }

    public DailyLifePatternDto getDailyLifePattern(String userId, LocalDate date) {
        DailyLifePattern entity = repository.findByPkUserIdAndPkDate(userId, date)
                .orElseThrow(() -> new IllegalArgumentException("해당 날짜의 daily_life_pattern 데이터가 없습니다."));

        return DailyLifePatternConverter.toDto(entity);
    }

    public List<DailyLifePatternDto> getDailyLifePatternList(String userId) {
        return repository.findByPkUserIdOrderByPkDateDesc(userId).stream()
                .map(DailyLifePatternConverter::toDto)
                .toList();
    }

    public DailyLifePatternInferenceDto getInference(String userId, LocalDate date) {
        DailyLifePatternInferenceDto dto = new DailyLifePatternInferenceDto();
        dto.setUserId(userId);
        dto.setDate(date);

        // 더미 값 채워 프런트가 표시할 수 있도록 함
        dto.setActivityScore(0.5);
        dto.setCircadianRhythmScore(0.6);

        dto.setDayCallUseDuration(10.0);
        dto.setDayCallUseFrequency(3.0);
        dto.setDayLightExposure(2.5);
        dto.setDayPhoneUseDuration(120.0);
        dto.setDayPhoneUseFrequency(15.0);
        dto.setDayStepCount(3000.0);
        dto.setDayTimeCount(8);

        dto.setHomeStayPercentage(70.0);
        dto.setIlluminationExposureScore(0.4);
        dto.setLifeRoutineConsistency(0.55);
        dto.setLocationDiversityScore(0.3);

        dto.setNightCallUseDuration(5.0);
        dto.setNightCallUseFrequency(2.0);
        dto.setNightLightExposure(1.5);
        dto.setNightPhoneUseDuration(90.0);
        dto.setNightPhoneUseFrequency(10.0);
        dto.setNightStepCount(1500.0);
        dto.setNightTimeCount(6);

        dto.setPhoneUsageScore(0.45);
        dto.setPlaceDiversity(1.2);
        dto.setLabel(1);
        return dto;
    }
}
