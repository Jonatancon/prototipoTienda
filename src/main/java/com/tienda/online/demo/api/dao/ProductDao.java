package com.tienda.online.demo.api.dao;

import com.tienda.online.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Long> {
}
