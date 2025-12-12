package com.imp.fluffy_mood.controller;

import com.imp.fluffy_mood.dto.BaseResponse;
import com.imp.fluffy_mood.dto.DailyLifePatternDto;
import com.imp.fluffy_mood.dto.DailyLifePatternInferenceDto;
import com.imp.fluffy_mood.service.DailyLifePatternService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/daily-life-pattern")
public class DailyLifePatternController {

    private final DailyLifePatternService service;

    public DailyLifePatternController(DailyLifePatternService service) {
        this.service = service;
    }

    // 패턴 조회: GET /api/daily-life-pattern?id=1&date=2025-12-01
    @GetMapping
    public BaseResponse<DailyLifePatternDto> getPattern(
            @RequestParam("id") String userId,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        try {
            DailyLifePatternDto data = service.getDailyLifePattern(userId, date);
            return BaseResponse.success(data);
        } catch (IllegalArgumentException e) {
            return BaseResponse.fail(404, e.getMessage());
        } catch (Exception e) {
            return BaseResponse.fail(500, "서버 오류");
        }
    }

    // 전체 패턴 목록 조회: GET /api/daily-life-pattern/list?id=user@example.com
    @GetMapping("/list")
    public BaseResponse<List<DailyLifePatternDto>> getPatternList(
            @RequestParam("id") String userId
    ) {
        try {
            List<DailyLifePatternDto> data = service.getDailyLifePatternList(userId);
            return BaseResponse.success(data);
        } catch (Exception e) {
            return BaseResponse.fail(500, "서버 오류");
        }
    }

    // 추론 조회: GET /api/daily-life-pattern/inference?id=1&date=2025-12-01
    // (아직 백엔드에 추론 테이블/로직이 없다면 일단 Not Implemented 처리)
    @GetMapping("/inference")
    public BaseResponse<DailyLifePatternInferenceDto> getInference(
            @RequestParam("id") String userId,
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        try {
            DailyLifePatternInferenceDto data = service.getInference(userId, date);
            return BaseResponse.success(data);
        } catch (Exception e) {
            return BaseResponse.fail(500, "서버 오류");
        }
    }
}
