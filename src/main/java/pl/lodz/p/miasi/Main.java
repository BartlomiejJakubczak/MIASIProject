package pl.lodz.p.miasi;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableProcessApplication
@EnableAsync
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
