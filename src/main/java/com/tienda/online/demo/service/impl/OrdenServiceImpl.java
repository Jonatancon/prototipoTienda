
package com.tienda.online.demo.service.impl;

import com.tienda.online.demo.api.dao.OrdenDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.Orden;
import com.tienda.online.demo.service.api.OrdenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public class OrdenServiceImpl extends GenericServicesImpl<Orden, Long> implements OrdenService{

    @Autowired
    private OrdenDao ordenDao;
    
    @Autowired
    private Orden orden;
    
    @Override
    public CrudRepository<Orden, Long> getDao() {
        return ordenDao;
    }
    
    @Override
    public Orden findByFk_user_id(Long userID){
        return orden;
    }
}
