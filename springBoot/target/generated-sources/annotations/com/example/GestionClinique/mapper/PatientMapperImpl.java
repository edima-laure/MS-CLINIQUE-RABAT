package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.PatientRequestDto;
import com.example.GestionClinique.dto.ResponseDto.PatientResponseDto;
import com.example.GestionClinique.model.entity.Patient;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-02T21:48:40+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Autowired
    private DossierMedicalMapper dossierMedicalMapper;

    @Override
    public Patient toEntity(PatientRequestDto patientRequestDto) {
        if ( patientRequestDto == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setNom( patientRequestDto.getNom() );
        patient.setPrenom( patientRequestDto.getPrenom() );
        patient.setEmail( patientRequestDto.getEmail() );
        patient.setDateNaissance( patientRequestDto.getDateNaissance() );
        patient.setTelephone( patientRequestDto.getTelephone() );
        patient.setAdresse( patientRequestDto.getAdresse() );
        patient.setGenre( patientRequestDto.getGenre() );
        patient.setDossierMedical( dossierMedicalMapper.toEntity( patientRequestDto.getDossierMedical() ) );

        return patient;
    }

    @Override
    public PatientResponseDto toDto(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientResponseDto patientResponseDto = new PatientResponseDto();

        patientResponseDto.setCreationDate( patient.getCreationDate() );
        patientResponseDto.setId( patient.getId() );
        patientResponseDto.setModificationDate( patient.getModificationDate() );
        patientResponseDto.setAdresse( patient.getAdresse() );
        patientResponseDto.setAge( patient.getAge() );
        patientResponseDto.setDateNaissance( patient.getDateNaissance() );
        patientResponseDto.setEmail( patient.getEmail() );
        patientResponseDto.setGenre( patient.getGenre() );
        patientResponseDto.setNom( patient.getNom() );
        patientResponseDto.setPrenom( patient.getPrenom() );
        patientResponseDto.setTelephone( patient.getTelephone() );

        return patientResponseDto;
    }

    @Override
    public List<PatientResponseDto> toDtoList(List<Patient> patients) {
        if ( patients == null ) {
            return null;
        }

        List<PatientResponseDto> list = new ArrayList<PatientResponseDto>( patients.size() );
        for ( Patient patient : patients ) {
            list.add( toDto( patient ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDto(PatientRequestDto patientRequestDto, Patient patient) {
        if ( patientRequestDto == null ) {
            return;
        }

        if ( patientRequestDto.getAdresse() != null ) {
            patient.setAdresse( patientRequestDto.getAdresse() );
        }
        if ( patientRequestDto.getDateNaissance() != null ) {
            patient.setDateNaissance( patientRequestDto.getDateNaissance() );
        }
        if ( patientRequestDto.getEmail() != null ) {
            patient.setEmail( patientRequestDto.getEmail() );
        }
        if ( patientRequestDto.getGenre() != null ) {
            patient.setGenre( patientRequestDto.getGenre() );
        }
        if ( patientRequestDto.getNom() != null ) {
            patient.setNom( patientRequestDto.getNom() );
        }
        if ( patientRequestDto.getPrenom() != null ) {
            patient.setPrenom( patientRequestDto.getPrenom() );
        }
        if ( patientRequestDto.getTelephone() != null ) {
            patient.setTelephone( patientRequestDto.getTelephone() );
        }
    }
}
