package com.imp.fluffy_mood.service;

import com.imp.fluffy_mood.dto.AnalysisResultDto;
import com.imp.fluffy_mood.entity.AnalysisResult;
import com.imp.fluffy_mood.repository.AnalysisResultRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnalysisResultService {

    private final AnalysisResultRepository repository;

    public AnalysisResultService(AnalysisResultRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public AnalysisResultDto save(AnalysisResultDto request) {
        AnalysisResult saved = repository.save(request.toEntity());
        return AnalysisResultDto.fromEntity(saved);
    }
}
