# Spring Boot 2.0 + Mustache + Handlebars example

## Prerequisite

- Java 1.8+

## Gradle

Mustache와 Handlebars를 사용하기 위해 `build.gradle`에 의존성을 추가한다.

```groovy
dependencies {
  implementation 'org.springframework.boot:spring-boot-starter-mustache'
  implementation 'pl.allegro.tech.boot:handlebars-spring-boot-starter:0.3.2'
}
```

### Mustache

[jmustache](https://github.com/samskivert/jmustache)는 [Mustache](https://mustache.github.io/) 템플릿의 java 구현체이다.

Spring boot starter 를 지원한다.

### Handlebars

[Handlebars](https://handlebarsjs.com/)는 Mustache의 확장 구현체이다.

Mustache 같이 java용 구현체로 [Handlebars.java](http://jknack.github.io/handlebars.java/)가 있다.

3rd party에서 지원하는 [spring boot starter](https://github.com/allegro/handlebars-spring-boot-starter)가 있으며 최신 버전까지 잘 지원하고 있다.

