package com.nps.iso;

import com.nps.iso.domain.Currency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@EntityScan(basePackageClasses=Currency.class)
public class Application {

    public static void main(String[] args) throws Exception {
        String url = System.getenv("SPRING_DATASOURCE_URL");
        String username = System.getenv("SPRING_DATASOURCE_USERNAME");
        String password = System.getenv("SPRING_DATASOURCE_PASSWORD");
        System.out.println(url+"|"+username+"|"+password);
        SpringApplication.run(Application.class, args);
    }
}
