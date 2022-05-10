package com.example.modulea;

import com.example.moduleb.IntermediateGreeting;
import com.example.modulec.BasicGreeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private static final String template = "Hello, %s!";

    @GetMapping("/greeting")
    public AdvancedGreeting greeting(@RequestParam(value = "basicGreeting", defaultValue = "basic greeting") String basicGreeting,
                                     @RequestParam(value = "intermediateGreeting", defaultValue = "intermediate greeting") String intermediateGreeting,
                                     @RequestParam(value = "advancedGreeting", defaultValue = "advanced greeting") String advancedGreeting) {


        return new AdvancedGreeting(new IntermediateGreeting(new BasicGreeting(basicGreeting), intermediateGreeting), advancedGreeting);
    }
}
