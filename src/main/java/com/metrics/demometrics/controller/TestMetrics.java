package com.metrics.demometrics.controller;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/metrics")
public class TestMetrics {
    @Autowired
    private MeterRegistry meterRegistry;

    @GetMapping
    public ResponseEntity<String> get () {
        meterRegistry.counter("test.metrics").increment();
        return new ResponseEntity<String>("Ok", HttpStatus.OK);
    }

}
