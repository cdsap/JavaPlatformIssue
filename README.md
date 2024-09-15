This repository demonstrates an issue involving the java-platform plugin and early task resolution when using `configuration.resolve()` in
task configuration.

### Steps to reproduce
Run `./gradlew build` to build the project.
You should see an error similar to:
```kotlin
An exception occurred applying plugin request [id: 'org.gradle.java-platform']
> Failed to apply plugin 'org.gradle.java-platform'.
> Project#afterEvaluate(Action) on project ':lib' cannot be executed in the current context.

```
Build Scan issue: https://ge.solutions-team.gradle.com/s/qetkurlfur3ig/failure?expanded-stacktrace=WyIwLTEtMiIsIjAtMSIsIjAiXQ#1
Quarkus issue: https://github.com/quarkusio/quarkus/issues/43258
