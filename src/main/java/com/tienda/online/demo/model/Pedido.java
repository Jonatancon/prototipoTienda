package com.tienda.online.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private String id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate fechaCreacion;
    @JoinColumn
    @ManyToOne
    private User user;
    @JoinColumn
    @OneToOne
    private CarShop carShop;
    private String estado;
    private String direccion;
    private BigDecimal total;
}
