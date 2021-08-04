/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.online.demo.api.dao;

import com.tienda.online.demo.model.MetodoPago;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author user
 */
public interface MetodoPagoDao extends CrudRepository<MetodoPago, Long>{
    
}
