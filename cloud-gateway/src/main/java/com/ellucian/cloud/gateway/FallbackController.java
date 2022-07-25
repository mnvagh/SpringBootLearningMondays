package com.ellucian.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/studentServiceFallback")
    public String studentServiceFallback(){
        return "Student Service is down !! Please try again later";
    }

    @GetMapping("/courseServiceFallback")
    public String courseServiceFallback(){
        return "Course Service is down !! Please try again later";
    }
}
