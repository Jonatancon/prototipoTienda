package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.Product;
import com.tienda.online.demo.service.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ProductController.PRODUCT)
public class ProductController {

    public static final String PRODUCT = "/product";
    public static final String GET_ALL = "/get-all";
    public static final String FIND_BY_ID = "/find/{id}";
    public static final String SAVE_PRODUCT = "/save";
    public static final String DELETE_BY_ID = "/delete/{id}";

    @Autowired
    private ProductService productService;

    @GetMapping(GET_ALL)
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping(FIND_BY_ID)
    public Product find(@PathVariable Long id) {
        return productService.get(id);
    }

    @PostMapping(SAVE_PRODUCT)
    public ResponseEntity<Product> save(@RequestBody Product product) {
        Product obj = productService.save(product);
        return new ResponseEntity<Product>(obj, HttpStatus.CREATED);
    }

    @GetMapping(DELETE_BY_ID)
    public ResponseEntity<Product> delete(@PathVariable Long id) {
        Product product = productService.get(id);
        if(product != null) {
            productService.delete(id);
        }else{
            return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Product>(product, HttpStatus.OK);
    }

}
