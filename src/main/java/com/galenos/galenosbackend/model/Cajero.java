package com.galenos.galenosbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cajero")
public class Cajero extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCajero;
}
