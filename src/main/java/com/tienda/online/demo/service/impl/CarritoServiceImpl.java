/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.online.demo.service.impl;

import com.tienda.online.demo.api.dao.CarritoDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.Carrito;
import com.tienda.online.demo.model.User;
import com.tienda.online.demo.service.api.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl extends GenericServicesImpl<Carrito, Long> implements CarritoService{

    public static final String QUERYELIMINAR = "DELETE * from Carrito where fk_id_user =?1";
    
    @Autowired
    private CarritoDao carritoDao;
    
    @Override
    public CrudRepository<Carrito, Long> getDao() {
        return carritoDao;
    }
    
    @Query(value = CarritoServiceImpl.QUERYELIMINAR, nativeQuery = true)
    public void deleteProductsCarrito(User usuario){
        Long idUsuario = usuario.getId();
    }
}
