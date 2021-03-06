package com.products.products.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="products")
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productId;

    @Column(name="product_name", length = 255, nullable = false, unique = true)
    private String productName;

    @Column(name="product_desc", length = 255, nullable = true, unique = false)
    private String productDescription;

    @Column(name="product_mrp", nullable = false, unique = false)
    private Double productMrp;

    @Column(name="product_sel_price", precision=10, scale=2, nullable = true, unique = false)
    private Double productSelPrice;

    @Column(name="product_weight", precision=10, scale=2, nullable = false, unique = false)
    private Double productWeight;

    @Column(name="unit", nullable = false, unique = false)
    private String unitOfMeasurement;

    @Column(name="brand", nullable = true, unique = false)
    private String brand;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
