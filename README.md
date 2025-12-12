해당 프로젝트는 https://github.com/IMP-FINAL-PROJECT/FINAL-BACK에서 작업한 내용의 후속 연구활동입니다.

daily_life_pattern의 데이터를 가져와 프론트로 보내주고 ondeviceAI로 분석한 결과를 데이터베이스에 저장하는 역할을 합니다.
 
 ## Backend Overview
  - Stack: Spring Boot 3, Java 17, JPA (MariaDB), MongoDB, Lombok.
  - 패키지 구조: `controller`(REST), `service`(비즈니스), `repository`(JPA), `dto`(계약), `entity`(모델),
  `config`(DB/보안/로깅).
  - 공통 응답: `BaseResponse{result, status, data, message}` 또는 일부 레거시 `Message` 사용.

  ## Daily Life Pattern
  - 엔티티: `DailyLifePattern` (PK: user_id + date), 스코어/카운트 필드 대부분 Double, 카운트는 응답 시 정수 캐
  스팅.
  - DTO: 스네이크케이스 JSON 키, `label`은 숫자(0/1), null 방지를 위해 기본값 0.
  - 변환: `DailyLifePatternConverter`가 엔티티→DTO로 매핑하며 `label` 기본값 0 적용.
  - 서비스/컨트롤러:
    - 단건 조회: `GET /api/daily-life-pattern?id={userId}&date=yyyy-MM-dd`
    - 목록 조회: `GET /api/daily-life-pattern/list?id={userId}` (날짜 내림차순)
    - 추론 조회(더미): `GET /api/daily-life-pattern/inference?id={userId}&date=yyyy-MM-dd` → placeholder 값 반환,
  `label=1` 기본.

  ## Analysis Result 저장
  - 엔티티: `AnalysisResult`(auto PK `analysis_result_id`, user_id, date, analysis_type, score, confidence,
  label, comment, model_version, created_at/updated_at).
  - DTO/매핑: `AnalysisResultDto` with toEntity/fromEntity.
  - 저장 API: `POST /api/analysis-result` → 바디로 위 필드 전달, 저장 후 동일 필드로 응답.

  ## 기타 로직
  - Home/분석: `AnalysisController`/`AnalysisService`에서 일자별 분석 조회(`api/analysis`) 등 기존 레거시 엔드포
  인트 유지.
  - 예외 처리: `GlobalExceptionHandler`에서 공통 예외 로깅 및 응답 코드 매핑.

  ## 호출 예시
  - 단건 패턴: `curl "http://localhost:8080/api/daily-life-pattern?id=user@example.com&date=2025-12-12"`
  - 목록 패턴: `curl "http://localhost:8080/api/daily-life-pattern/list?id=user@example.com"`
  - 추론(더미): `curl "http://localhost:8080/api/daily-life-pattern/inference?id=user@example.com&date=2025-
  12-12"`
  - 추론 결과 저장:
    ```bash
    curl -X POST "http://localhost:8080/api/analysis-result" \
      -H "Content-Type: application/json" \
      -d '{"user_id":"user@example.com","date":"2025-12-
  12","analysis_type":"pattern","score":0.8,"confidence":0.9,"label":1,"comment":"ok","model_version":"v1"}'
