package com.tienda.online.demo.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "fk_id_user")
    @ManyToOne
    private User user;

    @JoinColumn(name = "fk_id_pago")
    @OneToOne
    private MetodoPago metodoPago;

    @JoinColumn(name = "fk_id_domicilio")
    @OneToOne
    private Domicilio domicilio;

    @NonNull
    private BigDecimal total;
}
