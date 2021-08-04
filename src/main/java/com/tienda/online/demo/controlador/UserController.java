/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.User;
import com.tienda.online.demo.service.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(UserController.USER)
public class UserController {

    public static final String USER = "/user";
    public static final String GET_ALL = "/get-all";
    public static final String FIND_BY_ID = "/find/{id}";
    public static final String SAVE_USER = "/save";
    public static final String DELETE_BY_ID = "/delete/{id}";
    
    @Autowired
    private UserService userService;
    
    
    @GetMapping(GET_ALL)
    public List<User> getAll(){
        return userService.getAll();
    }
    
    @GetMapping(FIND_BY_ID)
    public User find(@PathVariable Long id){
        return userService.get(id);
    }
    
    @PostMapping(SAVE_USER)
    public ResponseEntity<User> save(@RequestBody User user){
        User obj = userService.save(user);
        return new ResponseEntity<User>(obj, HttpStatus.CREATED);
    }
    
    @GetMapping(DELETE_BY_ID)
    public ResponseEntity<User> delete(@PathVariable Long id) {
        User user = userService.get(id);
        if(user != null) {
            userService.delete(id);
        }else{
            return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    
    
}
