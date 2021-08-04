
package com.tienda.online.demo.service.impl;

import com.tienda.online.demo.api.dao.MetodoPagoDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.MetodoPago;
import com.tienda.online.demo.service.api.MetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class MetodoPagoServiceImpl extends GenericServicesImpl<MetodoPago,Long> implements MetodoPagoService {

    @Autowired
    private MetodoPagoDao metodoPagoDao;
    
    
    @Override
    public CrudRepository<MetodoPago, Long> getDao() {
        return metodoPagoDao;
    }
    
    
    
}
