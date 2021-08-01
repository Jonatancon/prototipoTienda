package com.tienda.online.demo.service.impl;

import com.tienda.online.demo.api.dao.ProductDao;
import com.tienda.online.demo.commons.GenericServicesImpl;
import com.tienda.online.demo.model.Product;
import com.tienda.online.demo.service.api.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends GenericServicesImpl<Product, Long> implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public CrudRepository<Product, Long> getDao() {
        return productDao;
    }

}
