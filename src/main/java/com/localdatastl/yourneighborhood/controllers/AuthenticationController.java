package com.localdatastl.yourneighborhood.controllers;

import com.localdatastl.yourneighborhood.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthenticationController {

    @Autowired
    UserRepository userRepository;
    
}
