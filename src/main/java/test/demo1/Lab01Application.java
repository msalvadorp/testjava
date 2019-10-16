package test.demo1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import test.demo1.services.CardService;
import test.demo1.services.CardServiceImpl;

@SpringBootApplication
public class Lab01Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab01Application.class, args);
    }

    @Bean
    public CardService getCardService(){
        return new CardServiceImpl("123123123");

    }
}