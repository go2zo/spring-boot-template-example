package io.go2zo.tutorial.springboot.controller;

import io.go2zo.tutorial.springboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@RequiredArgsConstructor
@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public String getUserList(Model model) {
        model.addAttribute("users", userService.getUserList().orElse(Collections.emptyList()));
        return "users/list";
    }
}
