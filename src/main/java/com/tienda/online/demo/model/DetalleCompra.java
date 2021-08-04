package com.tienda.online.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "fk_id_orden")
    @ManyToOne
    private Orden orden;

    @JoinColumn(name = "fk_id_product")
    @ManyToOne
    private Product product;

    @NonNull
    private int cantidad;

    @NonNull
    private int precio;
}
