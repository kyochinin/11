package com.softusing.xuzhining.controller;

import com.softusing.xuzhining.domain.User;
import com.softusing.xuzhining.form.UserForm;
import com.softusing.xuzhining.service.UserServiceio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    //注入UserServicein依赖：
    @Autowired
    private UserServiceio userServiceio;

    // 处理注册页面的GET请求：
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }











    @PostMapping("/register")
    public String register(@Valid UserForm userForm , BindingResult result) {
        if (!userForm.confirmPassword()) {
            result.rejectValue("confirmPassword", "confirmError", "密码不一致");
        }
        if (result.hasErrors()) {
            return "register";
        }

        User user = userForm.convertToUser();
        userServiceio.save(user);
        return "redirect:/login";
    }

}
