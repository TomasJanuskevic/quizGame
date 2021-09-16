package com.quizzGame.frontend;

import com.quizzGame.dto.HealthCheckDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/health")
public class HealthCheckRestController {
    @GetMapping
    public HealthCheckDto healthCheck() {
        return new HealthCheckDto(true, "It's working!");
    }
}
