package jp.co.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@SpringBootApplication
public class SpringHerokuTestApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World! Tset eclipse ABC";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHerokuTestApplication.class, args);
    }
}