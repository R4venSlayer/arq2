package com.login.AppLogin.Service;

import com.login.AppLogin.Repository.UserRepo;
import com.login.AppLogin.Usuarios.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo repo;
    @Override
    public void registerUser(User user) {

        repo.save(user);

    }



}
