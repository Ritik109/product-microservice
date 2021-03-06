package com.products.products.services;

import com.products.products.entities.Product;
import com.products.products.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add_new_product(Product product){
        return productRepository.save(product);

    }

    public Product get_by_id(int id) {
        log.info("Product : "+productRepository.findById(id).toString()) ;
        return productRepository.findById(id).orElseThrow(null);
    }
}
