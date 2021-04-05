package com.products.products.entities;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="products")
@EntityListeners(AuditingEntityListener.class)
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int productId;

    @Column(name="product_name", length = 255, nullable = false, unique = true)
    @Size(min = 5,message = "Product Name should contain minimum 5 characters")
    @NotEmpty(message = "product_name can not be null")
    private String productName;

    @Column(name="product_desc", length = 255, nullable = true, unique = false)
    @Size(min = 5,message = "Product Name should contain minimum 5 characters")
    private String productDescription;

    @Column(name="product_mrp", nullable = false, unique = false)
    @NotEmpty(message = "product_mrp can not be null")
    private Double productMrp;

    @Column(name="product_sel_price", precision=10, scale=2, nullable = true, unique = false)
    private Double productSelPrice;

    @Column(name="product_weight", precision=10, scale=2, nullable = false, unique = false)
    @NotEmpty(message = "product_weight can not be null")
    private Double productWeight;

    @Column(name="unit", nullable = false, unique = false)
    @NotEmpty(message = "unit can not be null")
    private String unitOfMeasurement;

    @Column(name="product_alias", nullable = false, unique = true)
    @NotEmpty(message = "Product alias cannot be null in post body")
    private String productAlias;

    @Column(name="brand", nullable = true, unique = false)
    private String brand;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}
