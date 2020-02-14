package jp.co.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.DemoApplication;


@Controller
@SpringBootApplication
public class SpringHerokuTestApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World! Tset eclipse ";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}