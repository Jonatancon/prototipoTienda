
package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.DetalleCompra;
import com.tienda.online.demo.service.api.DetalleCompraService;
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
@RequestMapping(DetalleCompraController.DETALLECOMPRA)
public class DetalleCompraController {
    
    public static final String DETALLECOMPRA = "/detalleCompra";
    public static final String FIND_BY_ID = "/find/{id}";
    public static final String FIND_BY_ID_USER = "/findByUserId/{id}";
    public static final String SAVE_DETALLE_COMPRA = "/save";
    
    @Autowired
    private DetalleCompraService detalleCompraService;
    
    @GetMapping(FIND_BY_ID)
    public DetalleCompra find(@PathVariable Long id) {
        return detalleCompraService.get(id);
    }
    
    @GetMapping(FIND_BY_ID_USER)
    public DetalleCompra findByFk_id_orden(Long ordenId){
        DetalleCompra detalleCompra= detalleCompraService.findByFk_id_orden(ordenId);
        return detalleCompra;
    }
    
    @PostMapping(SAVE_DETALLE_COMPRA)
    public ResponseEntity<DetalleCompra> save(@RequestBody DetalleCompra detalleCompra) {
        DetalleCompra obj = detalleCompraService.save(detalleCompra);
        return new ResponseEntity<DetalleCompra>(obj, HttpStatus.CREATED);
    }
    
    
    
}
