package com.projectmarket.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;
    @Column(name = "Correo_electronico")
    private String correoElectronico;
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
