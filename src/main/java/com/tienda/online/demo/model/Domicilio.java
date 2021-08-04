package com.tienda.online.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "fk_id_usuario")
    @ManyToOne
    private User user;

    @NonNull
    private String ciudad;

    @NonNull
    private String departamento;

    @NonNull
    private String direcion;

    @NonNull
    private String codigoPostal;

}
