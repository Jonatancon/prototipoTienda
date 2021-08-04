package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.Domicilio;
import com.tienda.online.demo.model.Product;
import com.tienda.online.demo.service.api.DomicilioService;
import java.util.List;
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
@RequestMapping(DomicilioController.DOMICILIO)
public class DomicilioController{

    public static final String DOMICILIO = "/domicilio";
    public static final String GET_ALL = "/get-all";
    public static final String FIND_BY_ID = "/find/{id}";
    public static final String SAVE_DOMICILIO = "/save";
    public static final String DELETE_BY_ID = "/delete/{id}";
    
    @Autowired
    private DomicilioService domicilioService;
    
    @GetMapping(GET_ALL)
    public List<Domicilio> getAll(){
        return domicilioService.getAll();
    }
    
    @GetMapping(FIND_BY_ID)
    public Domicilio find(@PathVariable Long id){
        return domicilioService.get(id);
    }
    
    @PostMapping(SAVE_DOMICILIO)
    public ResponseEntity<Domicilio> save(@RequestBody Domicilio domicilio) {
        Domicilio obj = domicilioService.save(domicilio);
        return new ResponseEntity<Domicilio>(obj, HttpStatus.CREATED);
    }
    
    
    @GetMapping(DELETE_BY_ID)
    public ResponseEntity<Domicilio> delete(@PathVariable Long id) {
        Domicilio domicilio = domicilioService.get(id);
        if(domicilio != null) {
            domicilioService.delete(id);
        }else{
            return new ResponseEntity<Domicilio>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Domicilio>(domicilio, HttpStatus.OK);
    }
}
