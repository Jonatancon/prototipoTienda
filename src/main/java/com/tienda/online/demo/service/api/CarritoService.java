/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.online.demo.service.api;

import com.tienda.online.demo.commons.GenericServiceApi;
import com.tienda.online.demo.model.Carrito;
import com.tienda.online.demo.model.User;

/**
 *
 * @author user
 */
public interface CarritoService extends GenericServiceApi<Carrito, Long> {
    
    public void deleteByFk_user_id(Long idUser);
    
}
