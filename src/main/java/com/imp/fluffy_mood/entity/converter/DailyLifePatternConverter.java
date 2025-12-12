package com.imp.fluffy_mood.entity.converter;

import com.imp.fluffy_mood.dto.DailyLifePatternDto;
import com.imp.fluffy_mood.entity.DailyLifePattern;

public class DailyLifePatternConverter {

    public static DailyLifePatternDto toDto(DailyLifePattern entity) {
        DailyLifePatternDto dto = new DailyLifePatternDto();

        if (entity.getPk() != null) {
            dto.setUserId(entity.getPk().getUserId());
            dto.setDate(entity.getPk().getDate());
        }

        dto.setActivityScore(entity.getActivityScore());
        dto.setCircadianRhythmScore(entity.getCircadianRhythmScore());

        dto.setDayCallUseDuration(entity.getDayCallUseDuration());
        dto.setDayCallUseFrequency(entity.getDayCallUseFrequency());
        dto.setDayLightExposure(entity.getDayLightExposure());
        dto.setDayPhoneUseDuration(entity.getDayPhoneUseDuration());
        dto.setDayPhoneUseFrequency(entity.getDayPhoneUseFrequency());
        dto.setDayStepCount(entity.getDayStepCount());
        dto.setDayTimeCount(entity.getDayTimeCount() != null ? entity.getDayTimeCount().intValue() : null);

        dto.setHomeStayPercentage(entity.getHomeStayPercentage());
        dto.setIlluminationExposureScore(entity.getIlluminationExposureScore());
        dto.setLifeRoutineConsistency(entity.getLifeRoutineConsistency());
        dto.setLocationDiversityScore(entity.getLocationDiversityScore());

        dto.setNightCallUseDuration(entity.getNightCallUseDuration());
        dto.setNightCallUseFrequency(entity.getNightCallUseFrequency());
        dto.setNightLightExposure(entity.getNightLightExposure());
        dto.setNightPhoneUseDuration(entity.getNightPhoneUseDuration());
        dto.setNightPhoneUseFrequency(entity.getNightPhoneUseFrequency());
        dto.setNightStepCount(entity.getNightStepCount());
        dto.setNightTimeCount(entity.getNightTimeCount() != null ? entity.getNightTimeCount().intValue() : null);

        dto.setPhoneUsageScore(entity.getPhoneUsageScore());
        dto.setPlaceDiversity(entity.getPlaceDiversity());

        // label 컬럼이 없거나 null이면 기본값 0으로 내려 프런트 필터링/파싱 오류 방지
        dto.setLabel(0);

        return dto;
    }
}
