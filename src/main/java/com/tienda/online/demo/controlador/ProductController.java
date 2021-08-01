package com.tienda.online.demo.controlador;

import com.tienda.online.demo.model.Product;
import com.tienda.online.demo.service.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/find/{id}")
    public Product find(@PathVariable Long id) {
        return productService.get(id);
    }

    @PostMapping("/save")
    public ResponseEntity<Product> save(Product product) {
        Product obj = productService.save(product);
        return new ResponseEntity<Product>(obj, HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
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
