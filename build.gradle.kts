plugins {
    java
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "gim"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.1")
//    implementation("org.springframework.boot:spring-boot-starter-data-mongodb:3.2.1")
//    implementation("org.springframework.boot:spring-boot-starter-data-redis:3.2.1")
//    implementation("org.springframework.boot:spring-boot-starter-jooq:3.2.1")
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.1")
    implementation("org.springframework.boot:spring-boot-starter-graphql:3.2.1")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework:spring-webflux")
    testImplementation("org.springframework.graphql:spring-graphql-test")


    compileOnly("org.projectlombok:lombok:1.18.30")

    annotationProcessor("org.projectlombok:lombok:1.18.30")


    runtimeOnly("com.mysql:mysql-connector-j")


    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:15.0.0")
    implementation("com.graphql-java-kickstart:graphql-java-tools:13.0.3")

    testImplementation("com.graphql-java-kickstart:graphql-spring-boot-starter-test:15.0.0")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
