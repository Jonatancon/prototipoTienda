package com.tienda.online.demo.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String nombre;
    private int stock;
    private BigDecimal valor;
    //private String imgUrl;
}
