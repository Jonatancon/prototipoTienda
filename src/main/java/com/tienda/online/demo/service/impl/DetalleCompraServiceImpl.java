
package com.tienda.online.demo.service.impl;

import com.tienda.online.demo.api.dao.DetalleCompraDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.DetalleCompra;
import com.tienda.online.demo.service.api.DetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleCompraServiceImpl extends GenericServicesImpl<DetalleCompra, Long> implements DetalleCompraService {

    @Autowired
    private DetalleCompraDao detalleCompraDao;
    
    @Autowired
    private DetalleCompra detalleCompra;
    
    
    @Override
    public CrudRepository<DetalleCompra, Long> getDao() {
        return detalleCompraDao;
    }
    
    @Override
    public DetalleCompra findByFk_id_orden(Long userID){
        return detalleCompra;
    }
    
}
