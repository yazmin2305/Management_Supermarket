package com.projectmarket.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "categorias")
@Entity
@Setter
@Getter
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;
    private Integer descripcion;
    private Boolean estado;
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;


}
