package com.login.AppLogin.Controller;

import com.login.AppLogin.Repository.UserRepo;
import com.login.AppLogin.Service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.login.AppLogin.Usuarios.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {


    @Autowired
    private UserService service;
    @Autowired
    private UserRepo repo;

    @GetMapping("/")
    public String register(Model model){
        User user=new User();
        model.addAttribute("user",new User());
        return "Register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user){
        System.out.println(user);
        String pass = user.getContraseña();
        user.setContraseña(String.valueOf(pass.hashCode()));
        service.registerUser(user);
        return "login";
    }


}
