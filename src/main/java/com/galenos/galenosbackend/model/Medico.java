package com.galenos.galenosbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "medico")
public class Medico extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedico;
}
