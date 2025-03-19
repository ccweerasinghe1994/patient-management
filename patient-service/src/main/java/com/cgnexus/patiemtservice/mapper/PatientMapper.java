package com.cgnexus.patiemtservice.mapper;

import com.cgnexus.patiemtservice.dto.PatientResponseDTO;
import com.cgnexus.patiemtservice.model.Patient;

import java.time.LocalDateTime;
import java.util.UUID;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setEmail(patient.getEmail());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientResponseDTO;
    }

    public Patient toEntity(PatientResponseDTO patientResponseDTO) {
        Patient patient = new Patient();
        patient.setId(UUID.fromString(patientResponseDTO.getId()));
        patient.setName(patientResponseDTO.getName());
        patient.setEmail(patientResponseDTO.getEmail());
        patient.setAddress(patientResponseDTO.getAddress());
        patient.setDateOfBirth(LocalDateTime.parse(patientResponseDTO.getDateOfBirth()));
        return patient;
    }

}
