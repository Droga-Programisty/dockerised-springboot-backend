package pl.drogaprogramisty.dockerisedspringbootbackend;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name}")
    private String name;
    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping()
    public String hello() {
        return "Hello, " + name + ". We are running on: " + applicationName;
    }
}
