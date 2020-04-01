package co.pragra.learning.spring2.config;

import co.pragra.learning.spring2.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@Configuration
@Profile("dev")
public class DevConfig {
    @Bean
    public Product product(){
        return new Product(123L,"2kjhjdhjd", BigDecimal.valueOf(23.23),"C++ Learning","ass");
    }
}
