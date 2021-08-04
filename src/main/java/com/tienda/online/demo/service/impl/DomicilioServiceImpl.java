
package com.tienda.online.demo.service.impl;

import com.tienda.online.demo.api.dao.DomicilioDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.Domicilio;
import com.tienda.online.demo.service.api.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends GenericServicesImpl<Domicilio, Long> implements DomicilioService{

    @Autowired
    private DomicilioDao domicilioDao;
    
    
    @Override
    public CrudRepository<Domicilio, Long> getDao() {
        return domicilioDao;
    }
    
}
