package com.ram.pms.repository;


import com.ram.pms.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
