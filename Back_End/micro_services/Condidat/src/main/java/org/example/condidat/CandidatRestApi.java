package org.example.condidat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mic1/candidat")
public class CandidatRestApi {
    @GetMapping("/hello")
    public String sayhello(){
        return "hello I'm microservice 1 ";
    }
}
