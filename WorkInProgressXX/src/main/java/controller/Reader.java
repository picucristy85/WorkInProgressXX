package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
class MyController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("serverTime", LocalDateTime.now());
        return "index";
    }
}
