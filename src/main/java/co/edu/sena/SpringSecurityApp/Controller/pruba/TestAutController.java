package co.edu.sena.SpringSecurityApp.Controller.pruba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public abstract class TestAutController {

@GetMapping("/hello")
        public String hello(){
            return "Hello World";
        }
 @GetMapping("/hello-secured")
        public String helloSecured(){
            return "Hello World Secured";
        }             
}
