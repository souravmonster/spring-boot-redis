package com.sourav.springdataredisdemo.service;

import com.sourav.springdataredisdemo.entity.Product;
import com.sourav.springdataredisdemo.repository.ProductDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductDao dao;

    public Product save(Product product) {
        return dao.save(product);
    }

    public List<Product> findAll() {
        return dao.findAll();
    }

    public Product findProductById(int id) {
        log.info("Called findProductById from DB :: Service Layer" + id);
        return dao.findProductById(id);
    }

    public String deleteProduct(int id) {
        return dao.deleteProduct(id);
    }
}
