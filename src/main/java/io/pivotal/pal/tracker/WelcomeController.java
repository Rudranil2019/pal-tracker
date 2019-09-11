package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import javax.validation.Valid;

@RestController
public class WelcomeController {
    private String message;

    public WelcomeController(@Value("${welcome.message}")String message){
        this.message=message;
=======
@RestController
public class WelcomeController {


    private String message;

    public WelcomeController(@Value("${welcome.message}") String message) {
        this.message = message;
>>>>>>> e0b7808a438e52fd921dddfb9745820b05b76e02
    }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}