package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.Carrito;
import com.tienda.online.demo.model.User;
import com.tienda.online.demo.service.api.CarritoService;
import com.tienda.online.demo.service.api.UserService;
import com.tienda.online.demo.service.impl.CarritoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CarritoController.CARRITO)
public class CarritoController {
    
    public static final String CARRITO = "/carrito";
    public static final String GET_ALL = "/get-all";
    public static final String FIND_BY_ID = "/find/{id}";
    public static final String SAVE_CARRITO = "/save";
    public static final String DELETE_BY_ID = "/delete/{id}";
    public static final String DELETE_BY_USER_ID = "/deletebyUserId/{idUser}";
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private CarritoService carritoService;

    @GetMapping(GET_ALL)
    public List<Carrito> getAll(){
        return carritoService.getAll();
    }

    @GetMapping(FIND_BY_ID)
    public Carrito find(@PathVariable Long id) {
        return carritoService.get(id);
    }

    @PostMapping(SAVE_CARRITO)
    public ResponseEntity<Carrito> save(@RequestBody Carrito carrito) {
        Carrito obj = carritoService.save(carrito);
        return new ResponseEntity<Carrito>(obj, HttpStatus.CREATED);
    }

    @GetMapping(DELETE_BY_ID)
    public ResponseEntity<Carrito> delete(@PathVariable Long id) {
        Carrito carrito = carritoService.get(id);
        if(carrito != null) {
            carritoService.delete(id);
        }else{
            return new ResponseEntity<Carrito>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Carrito>(carrito, HttpStatus.OK);
    }
    
    @DeleteMapping(DELETE_BY_USER_ID)
    public ResponseEntity<Carrito> deleteByFK_user_id(@PathVariable Long idUser){
        User usuario = userService.get(idUser);
        
        if(usuario != null) {
            carritoService.deleteByFk_user_id(idUser);
        }else{
            return new ResponseEntity<Carrito>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Carrito>(HttpStatus.OK);
    }
    
    
    
}
