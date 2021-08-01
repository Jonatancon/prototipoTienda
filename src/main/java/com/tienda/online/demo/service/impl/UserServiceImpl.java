/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.online.demo.service.impl;
import com.tienda.online.demo.api.dao.UserDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.User;
import com.tienda.online.demo.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends GenericServicesImpl<User, Long> implements UserService {
    @Autowired
    private UserDao userDao;
    
    @Override
    public CrudRepository<User, Long> getDao(){
        return userDao;
    }
}
