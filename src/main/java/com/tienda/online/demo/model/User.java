package com.tienda.online.demo.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Enumerated(EnumType.STRING)
    private String rol;
    private boolean active;
}
