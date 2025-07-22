package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDto;
import com.pm.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDto toDTO(Patient patient) {
        PatientResponseDto patientDTO = new PatientResponseDto();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setName(patient.getName());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());

        return patientDTO;
    }
}
