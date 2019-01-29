package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:3000");
                registry.addMapping("/greeting-posttest").allowedOrigins("http://localhost:3000");
//                .allowedHeaders("Access-Control-Request-Method", "Origin", "Access-Control-Request-Headers")
//                .allowedMethods("POST", "OPTIONS", "HEAD", "GET", "PATCH")
//                .exposedHeaders("Access-Control-Allow-Origin");
            }
        };
    }

}
