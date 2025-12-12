package com.imp.fluffy_mood.controller;

import com.imp.fluffy_mood.dto.AnalysisResultDto;
import com.imp.fluffy_mood.dto.BaseResponse;
import com.imp.fluffy_mood.service.AnalysisResultService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analysis-result")
public class AnalysisResultController {

    private final AnalysisResultService service;

    public AnalysisResultController(AnalysisResultService service) {
        this.service = service;
    }

    // 추론 저장: POST /api/analysis-result
    @PostMapping
    public BaseResponse<AnalysisResultDto> saveAnalysisResult(@RequestBody AnalysisResultDto request) {
        try {
            AnalysisResultDto saved = service.save(request);
            return BaseResponse.success(saved);
        } catch (Exception e) {
            return BaseResponse.fail(500, "서버 오류");
        }
    }
}
