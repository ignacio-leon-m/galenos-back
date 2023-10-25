package com.galenos.galenosbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rut", unique = true)
    private int rut;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido_pat")
    private String apellidoPat;
    @Column(name = "apellido_mat")
    private String apellidoMat;
    @Column(name = "celular")
    private String celular;
    @Column(name = "edad")
    private int edad;
    @Column(name = "mail")
    private String mail;
    @Column(name = "password")
    private String password;
}
