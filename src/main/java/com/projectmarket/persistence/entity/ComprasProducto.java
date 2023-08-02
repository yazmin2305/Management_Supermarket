package com.projectmarket.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class ComprasProducto {
    @EmbeddedId //clave primaria compuesta
    private ComprasProductoPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_compra", updatable = false, insertable = false)
    private Compra compra;
    @ManyToOne
    @JoinColumn(name = "id_productos", updatable = false, insertable = false)
    private Producto producto;
}
