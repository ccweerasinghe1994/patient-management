package com.cgnexus.patiemtservice.service;

import com.cgnexus.patiemtservice.dto.PatientResponseDTO;

import java.util.List;

public interface IPatientService {

    List<PatientResponseDTO> getPatients();
}
