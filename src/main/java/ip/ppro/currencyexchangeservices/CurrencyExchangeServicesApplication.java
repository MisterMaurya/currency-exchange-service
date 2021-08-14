package ip.ppro.currencyexchangeservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
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
