package faustofjunqueira.com.github.demospringcamel.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"faustofjunqueira.com.github.demospringcamel"})
@EnableJpaRepositories("faustofjunqueira.com.github.demospringcamel.domain.repository")
@EntityScan(basePackages = {"faustofjunqueira.com.github.demospringcamel.domain.model"})
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}
