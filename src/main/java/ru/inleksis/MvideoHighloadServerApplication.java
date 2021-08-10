package ru.inleksis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class MvideoHighloadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MvideoHighloadServerApplication.class, args);
    }

}
