package com.galenos.galenosbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "secretaria")
public class Secretaria extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSecretaria;


}
