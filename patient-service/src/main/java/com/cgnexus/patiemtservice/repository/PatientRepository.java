package com.cgnexus.patiemtservice.repository;

import com.cgnexus.patiemtservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<Patient, UUID> {
}
