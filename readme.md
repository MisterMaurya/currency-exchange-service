# CURRENCY-EXCHANGE-SERVICE

## bootstrap.properties

```java
spring.application.name=currency-exchange-service
 server.port=8000

 #Cloud Config URL
 spring.cloud.config.uri=http://localhost:8888/

 #SQL
 spring.jpa.show-sql=true

 #H2 ENABLE
 spring.h2.console.enabled=true
 spring.datasource.url=jdbc:h2:mem:testdb
 spring.jpa.defer-datasource-initialization=true

 #Eureka Client URL
 eureka.client.service-url.default-zone=http://localhost:8761/eureka/
```

## Main Class

```java

@SpringBootApplication
// TO CONNECT WITH EUREKA
@EnableDiscoveryClient
public class CurrencyExchangeServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeServicesApplication.class, args);
    }

    // IF WE WANT TO TRACE ALL THE REQUEST WE NEED TO CREATE SAMPLER BEAN (spring-cloud-starter-sleuth)
    // IT WILL INTERCEPTS ALL THE REQUEST
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }

}

```

## pom.xml

```java
<!--For REST API-->
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<!-- TO CONNECT WITH CONFIG SERVER-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
</dependency>

<!-- READ THE PROPERTY FROM BOOTSTRAP-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bootstrap</artifactId>
</dependency>

<!--TO LOG ALL THE REQUEST WITH UNIQUE ID-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-sleuth</artifactId>
</dependency>

<!--TO CONNECT WITH EUREKA SERVER-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>

<!--FOR IN MEMORY DATABASE-->
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
</dependency>
```
    