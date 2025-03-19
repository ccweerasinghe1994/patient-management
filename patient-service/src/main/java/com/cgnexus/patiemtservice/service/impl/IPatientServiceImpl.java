package com.cgnexus.patiemtservice.service.impl;

import com.cgnexus.patiemtservice.dto.PatientResponseDTO;
import com.cgnexus.patiemtservice.mapper.PatientMapper;
import com.cgnexus.patiemtservice.model.Patient;
import com.cgnexus.patiemtservice.repository.PatientRepository;
import com.cgnexus.patiemtservice.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IPatientServiceImpl implements IPatientService {

    private final PatientRepository patientRepository;

    @Override
    public List<PatientResponseDTO> getPatients() {
        List<Patient> patientList = patientRepository.findAll();
        return patientList.stream().map(PatientMapper::toDTO).collect(Collectors.toList());
    }
}
