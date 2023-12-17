package com.mkyong;

// HelloWorldController.java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private int counter = 0;

    @GetMapping("/hello-world")
    public String helloWorld() {
        counter++;
        return "hello-world-" + counter;
	}
}