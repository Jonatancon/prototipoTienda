package com.tienda.online.demo.service.api;

import com.tienda.online.demo.commons.GenericServiceApi;
import com.tienda.online.demo.model.Orden;

public interface OrdenService extends GenericServiceApi<Orden, Long> {
    
    
    public Orden findByFk_user_id(Long userID);

}