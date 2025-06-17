package com.spring.citas.backend.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private User cliente;

    @ManyToOne
    private Service servicio;

    private LocalDate fecha;
    private LocalTime hora;
    private String estado; // PENDIENTE, CONFIRMADA, CANCELADA
}
