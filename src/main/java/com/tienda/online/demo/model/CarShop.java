package com.tienda.online.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class CarShop {

    @Id
    @GeneratedValue
    @Column(unique = false)
    private Long id;
    @JoinColumn
    @ManyToOne
    private User user;
    @JoinColumn
    @ManyToOne
    private Product productos;
    private int cantidad;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate fechaAgregado;

}
