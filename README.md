#  Gradle bootstrap project.

Built using the following commands.

    gradle wrapper --gradle-version=4.10.2
    ./gradlew init --type java-application


To run:

    ./gradlew clean build shadowJar
    java -jar build/libs/foo-0.1-all.jar
    
    # or
    ./gradlew clean build runShadow

