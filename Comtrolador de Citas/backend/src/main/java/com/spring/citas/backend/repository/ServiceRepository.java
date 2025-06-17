package com.spring.citas.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.citas.backend.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {}

