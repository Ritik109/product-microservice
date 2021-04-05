package com.products.products.services;

import com.products.products.entities.Product;
import com.products.products.exception.ProductNotFoundException;
import com.products.products.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product add_new_product(Product product){
        Product product1 = productRepository.save(product);
        return product1;

    }

    public Product get_by_id(int id) {
        Product productDetails = productRepository.findById(id).orElse(null);
        if(productDetails==null){
            log.info("####################### \nProduct Id "+id+" not found");
            throw new ProductNotFoundException("Product with id "+id+" does not exists");

        }
        return productDetails;
    }

    public List<Product> get_all_product() {
        return productRepository.findAll();
    }
}
