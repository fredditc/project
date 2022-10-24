/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.accenture.project.Service;

import com.accenture.project.Controller.UserController;
import com.accenture.project.Entity.User;
import com.accenture.project.Repository.UserRepository;
import org.h2.command.dml.MergeUsing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author alfredotorres
 */
public class UserServiceTest {
    
    private UserRepository userRepository = Mockito.mock(UserRepository.class);
    
    @Autowired
    UserService userService;
    
    @BeforeEach
    void setup(){
        
    }
    
    @Test
    void findUserById(Long id){
        
       
    }
    
}
 