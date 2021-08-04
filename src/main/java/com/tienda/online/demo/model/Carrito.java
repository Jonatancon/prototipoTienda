package com.tienda.online.demo.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "fk_id_user")
    @ManyToOne
    private User user;

    @JoinColumn(name = "fk_id_product")
    @ManyToOne
    private Product product;

    @NonNull
    private int cantidad;

    @NonNull
    private BigDecimal precio;

}
