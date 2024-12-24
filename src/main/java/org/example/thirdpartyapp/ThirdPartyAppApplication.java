package org.example.thirdpartyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ThirdPartyAppApplication {


     @GetMapping("/test/data")
     public String getData(){
         return "test is successful";
     }
    public static void main(String[] args) {
        SpringApplication.run(ThirdPartyAppApplication.class, args);
    }

}
