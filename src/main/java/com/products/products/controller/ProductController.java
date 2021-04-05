package com.products.products.controller;

import com.products.products.entities.Product;
import com.products.products.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/save")
    public Product add_new(@Valid @RequestBody  Product product){
log.info("Inside POST new product : "+product.toString());
        return productService.add_new_product(product);
    }

    @GetMapping("/get/{id}")
    public Product get_product_by_id(@PathVariable(value = "id") int id){
        return productService.get_by_id(id);
    }
    @GetMapping("/get-all")
    public List<Product> get_all_product(){
        return productService.get_all_product();
    }


}
