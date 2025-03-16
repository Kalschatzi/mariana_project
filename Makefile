.PHONY: clean-java
clean-java:
	./gradlew :java-service:clean -x test

.PHONY: build-java
build-java: clean-java
	./gradlew :java-service:build -x test

.PHONY: test-java
test-java:
	./gradlew :java-service:test


.PHONY: run-java
run-java:
	./gradlew :java-service:run