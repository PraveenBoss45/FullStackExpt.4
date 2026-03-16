# Spring Dependency Injection - Constructor and Setter Injection

## Project Name
`SpringDIStudent`

## Included
- `Student` POJO with fields: `studentId`, `name`, `course`, `year`
- Constructor injection for all fields
- Setter injection for `course` and `year`
- XML-based Spring configuration and main class
- Annotation-based Java configuration and main class

## Run XML version
```bash
mvn compile
mvn exec:java
```

## Run Annotation version
```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.institute.app.AnnotationInjectionMain"
```
