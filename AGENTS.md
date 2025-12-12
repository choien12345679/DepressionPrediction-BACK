# Repository Guidelines

## Project Structure & Modules
- Code lives in `src/main/java/com/imp/fluffy_mood`, organized by layer: `controller` (HTTP endpoints), `service` (business logic), `repository` (JPA + MongoDB data access), `dto` (request/response contracts), `entity` (JPA models), `config` (security, web, Mongo/MariaDB, logging).
- Application entry point: `src/main/java/com/imp/fluffy_mood/FluffyMoodApplication.java`.
- Resources and configuration: `src/main/resources` (`application.properties`, `log4j2.xml`). Tests belong in `src/test/java`.

## Build, Test, and Run
- `./gradlew clean build` – compile, run checks, and assemble JAR.
- `./gradlew test` – run JUnit 5/Spring Boot tests.
- `./gradlew bootRun` – start the API locally (uses `application.properties`).
- `./gradlew bootBuildImage` – build a container image via Paketo (requires Docker).

## Coding Style & Naming Conventions
- Java 17, Spring Boot 3.x, Lombok enabled. Prefer constructor injection; avoid field injection.
- Indentation: 4 spaces; keep lines readable (<120 chars when practical).
- REST controllers: use `@RestController` and map paths under `/api/...`; method names should describe intent (`createMood`, `getDailyLifePattern`).
- DTOs/entities use PascalCase class names; request DTOs end with `Dto`. Enum values in `UPPER_SNAKE_CASE`.
- Prefer `Optional` handling over null checks; centralize validation with `@Valid` and method-level constraints.

## Testing Guidelines
- Framework: Spring Boot test starter + JUnit 5; mock security when needed via `spring-security-test`.
- Place tests in `src/test/java/...` mirroring the main package. Use `*Test` or `*Tests` suffix.
- Favor slice tests for controllers/repositories when possible; use `@SpringBootTest` for integration paths.
- Aim to cover service logic (happy + edge cases). Add dataset builders/fixtures instead of inlined JSON where feasible.

## Configuration & Security Tips
- Do not commit real credentials; override `application.properties` with environment variables or a local `application-local.properties` ignored by git.
- MySQL (localhost:3307, db `final`) and MongoDB (localhost:27017, db `fluffy_mood`) are expected by default—align local containers accordingly.
- Logging uses Log4j2; keep sensitive data out of logs.

## Commit & Pull Request Guidelines
- Commit messages: imperative mood, short summary (`Add mood validation`, `Fix sensor lookup`). Group related changes; avoid mixed concerns.
- Pull requests should explain the change, affected endpoints, and any schema/config updates. Link issues/tasks and include screenshots or sample requests/responses for API changes.
- Ensure CI/`./gradlew test` passes before requesting review; mention any known gaps or follow-ups in the PR description.
