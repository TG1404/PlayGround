package playground.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tomergal
 * @since 28/02/18
 */
@RestController
public class HelloWorldEndPoint {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }
}
