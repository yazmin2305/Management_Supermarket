package com.projectmarket.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_cliente")
    private String idCliente;
    private LocalDateTime fecha;
    @Column(name = "medio_pago")
    private String medioPago;
    private String comentario;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id", updatable = false, insertable = false)
    private Cliente cliente;
    @OneToMany(mappedBy = "compra")
    private List<ComprasProducto> productos;
}
