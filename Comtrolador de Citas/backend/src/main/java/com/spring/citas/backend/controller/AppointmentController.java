package com.spring.citas.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.citas.backend.model.Appointment;
import com.spring.citas.backend.repository.AppointmentRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment cita) {
        return appointmentRepository.save(cita);
    }

    @PutMapping("/{id}")
    public Appointment update(@PathVariable Long id, @RequestBody Appointment updated) {
        Appointment cita = appointmentRepository.findById(id).orElseThrow();
        cita.setFecha(updated.getFecha());
        cita.setHora(updated.getHora());
        cita.setEstado(updated.getEstado());
        return appointmentRepository.save(cita);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        appointmentRepository.deleteById(id);
    }

}

