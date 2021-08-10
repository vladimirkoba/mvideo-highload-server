package ru.inleksis.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.inleksis.service.CriticalBusinessDataService;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CriticalBusinessDataController {
    private final static AtomicLong count = new AtomicLong(0);

    public CriticalBusinessDataController(CriticalBusinessDataService cbdService) {
        this.cbdService = cbdService;
    }

    private final CriticalBusinessDataService cbdService;

    @GetMapping(value = "/critical-business-data",produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<String> criticalBusinessData() {
        System.out.println("Number of request" + count.addAndGet(1));
        return cbdService.generateCriticalBusinessData();
    }
}
