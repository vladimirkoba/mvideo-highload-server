package ru.inleksis.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
@Slf4j
public class CriticalBusinessDataService {
    public Flux<String> generateCriticalBusinessData() {
        return Flux.just("40","41","42").delayElements(Duration.ofSeconds(1)).log();
    }
}
