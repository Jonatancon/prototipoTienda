
package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.Orden;
import com.tienda.online.demo.service.api.OrdenService;
import com.tienda.online.demo.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(OrdenController.ORDEN)
public class OrdenController {
    
    public static final String ORDEN = "/orden";
    public static final String FIND_BY_ID = "/find/{id}";
    public static final String FIND_BY_ID_USER = "/findByUserId/{id}";
    public static final String SAVE_ORDEN = "/save";
    
    @Autowired
    private OrdenService ordenService;
    
    @GetMapping(FIND_BY_ID)
    public Orden find(@PathVariable Long id) {
        return ordenService.get(id);
    }
    
    @GetMapping(FIND_BY_ID_USER)
    public Orden findByFk_user_id(Long userId){
        Orden orden = ordenService.findByFk_user_id(userId);
        return orden;
    }
    
    @PostMapping(SAVE_ORDEN)
    public ResponseEntity<Orden> save(@RequestBody Orden orden) {
        Orden obj = ordenService.save(orden);
        return new ResponseEntity<Orden>(obj, HttpStatus.CREATED);
    }
    
    
    
}
