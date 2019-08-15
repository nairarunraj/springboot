# springboot
Beginner's guide for a Java Spring Boot application using Gradle

## Installation
Depending on your host OS, run gradlew or gradlew.bat to download the Gradle distribution if it is not already present in your GRADLE_USER_HOME/wrapper/dists directory

## Deployment
### Using bootRun task
```
./gradlew bootRun
```

### Building and running the jar
```
./gradlew clean build jar
java -jar build/libs/springboot-VERSION.jar
```