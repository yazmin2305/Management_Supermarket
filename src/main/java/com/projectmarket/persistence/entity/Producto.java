package com.projectmarket.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="productos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ->permite que Java genere este valor automaticamente. De esta formma porque es la clave primaria
    @Column(name = "id_producto")
    private Integer idProducto;
    private String nombre;
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Column(name = "precio_venta")
    private Double precioVenta;
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) //no se va a hacer el crud de categoria. Solo realiza la relacion de categoria y producto
    private Categoria categoria;
}
