package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.DossierMedicalRequestDto;
import com.example.GestionClinique.dto.ResponseDto.ConsultationResponseDto;
import com.example.GestionClinique.dto.ResponseDto.DossierMedicalResponseDto;
import com.example.GestionClinique.dto.ResponseDto.PatientResponseDto;
import com.example.GestionClinique.dto.ResponseDto.PrescriptionResponseDto;
import com.example.GestionClinique.model.entity.Consultation;
import com.example.GestionClinique.model.entity.DossierMedical;
import com.example.GestionClinique.model.entity.Patient;
import com.example.GestionClinique.model.entity.Prescription;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:16+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class DossierMedicalMapperImpl implements DossierMedicalMapper {

    @Override
    public DossierMedical toEntity(DossierMedicalRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        DossierMedical dossierMedical = new DossierMedical();

        dossierMedical.setAllergies( dto.getAllergies() );
        dossierMedical.setAntecedentsMedicaux( dto.getAntecedentsMedicaux() );
        dossierMedical.setDernierTraitement( dto.getDernierTraitement() );
        dossierMedical.setGroupeSanguin( dto.getGroupeSanguin() );
        dossierMedical.setObservations( dto.getObservations() );

        return dossierMedical;
    }

    @Override
    public DossierMedicalResponseDto toDto(DossierMedical entity) {
        if ( entity == null ) {
            return null;
        }

        DossierMedicalResponseDto dossierMedicalResponseDto = new DossierMedicalResponseDto();

        dossierMedicalResponseDto.setPatient( patientToPatientResponseDto( entity.getPatient() ) );
        dossierMedicalResponseDto.setCreationDate( entity.getCreationDate() );
        dossierMedicalResponseDto.setId( entity.getId() );
        dossierMedicalResponseDto.setModificationDate( entity.getModificationDate() );
        dossierMedicalResponseDto.setAllergies( entity.getAllergies() );
        dossierMedicalResponseDto.setAntecedentsMedicaux( entity.getAntecedentsMedicaux() );
        dossierMedicalResponseDto.setConsultations( consultationListToConsultationResponseDtoList( entity.getConsultations() ) );
        dossierMedicalResponseDto.setDernierTraitement( entity.getDernierTraitement() );
        dossierMedicalResponseDto.setGroupeSanguin( entity.getGroupeSanguin() );
        dossierMedicalResponseDto.setObservations( entity.getObservations() );

        return dossierMedicalResponseDto;
    }

    @Override
    public void updateEntityFromDto(DossierMedicalRequestDto dto, DossierMedical entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getAllergies() != null ) {
            entity.setAllergies( dto.getAllergies() );
        }
        if ( dto.getAntecedentsMedicaux() != null ) {
            entity.setAntecedentsMedicaux( dto.getAntecedentsMedicaux() );
        }
        if ( dto.getDernierTraitement() != null ) {
            entity.setDernierTraitement( dto.getDernierTraitement() );
        }
        if ( dto.getGroupeSanguin() != null ) {
            entity.setGroupeSanguin( dto.getGroupeSanguin() );
        }
        if ( dto.getObservations() != null ) {
            entity.setObservations( dto.getObservations() );
        }
    }

    @Override
    public List<DossierMedicalResponseDto> toDtoList(List<DossierMedical> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DossierMedicalResponseDto> list = new ArrayList<DossierMedicalResponseDto>( entities.size() );
        for ( DossierMedical dossierMedical : entities ) {
            list.add( toDto( dossierMedical ) );
        }

        return list;
    }

    protected PatientResponseDto patientToPatientResponseDto(Patient patient) {
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

    protected PrescriptionResponseDto prescriptionToPrescriptionResponseDto(Prescription prescription) {
        if ( prescription == null ) {
            return null;
        }

        PrescriptionResponseDto prescriptionResponseDto = new PrescriptionResponseDto();

        prescriptionResponseDto.setCreationDate( prescription.getCreationDate() );
        prescriptionResponseDto.setId( prescription.getId() );
        prescriptionResponseDto.setModificationDate( prescription.getModificationDate() );
        prescriptionResponseDto.setDureePrescription( prescription.getDureePrescription() );
        prescriptionResponseDto.setInstructions( prescription.getInstructions() );
        prescriptionResponseDto.setMedicaments( prescription.getMedicaments() );
        if ( prescription.getQuantite() != null ) {
            prescriptionResponseDto.setQuantite( prescription.getQuantite().longValue() );
        }
        prescriptionResponseDto.setTypePrescription( prescription.getTypePrescription() );

        return prescriptionResponseDto;
    }

    protected List<PrescriptionResponseDto> prescriptionListToPrescriptionResponseDtoList(List<Prescription> list) {
        if ( list == null ) {
            return null;
        }

        List<PrescriptionResponseDto> list1 = new ArrayList<PrescriptionResponseDto>( list.size() );
        for ( Prescription prescription : list ) {
            list1.add( prescriptionToPrescriptionResponseDto( prescription ) );
        }

        return list1;
    }

    protected ConsultationResponseDto consultationToConsultationResponseDto(Consultation consultation) {
        if ( consultation == null ) {
            return null;
        }

        ConsultationResponseDto consultationResponseDto = new ConsultationResponseDto();

        consultationResponseDto.setCreationDate( consultation.getCreationDate() );
        consultationResponseDto.setId( consultation.getId() );
        consultationResponseDto.setModificationDate( consultation.getModificationDate() );
        consultationResponseDto.setCompteRendu( consultation.getCompteRendu() );
        consultationResponseDto.setDiagnostic( consultation.getDiagnostic() );
        consultationResponseDto.setMotifs( consultation.getMotifs() );
        consultationResponseDto.setPoids( consultation.getPoids() );
        consultationResponseDto.setPrescriptions( prescriptionListToPrescriptionResponseDtoList( consultation.getPrescriptions() ) );
        consultationResponseDto.setTaille( consultation.getTaille() );
        consultationResponseDto.setTemperature( consultation.getTemperature() );
        consultationResponseDto.setTensionArterielle( consultation.getTensionArterielle() );

        return consultationResponseDto;
    }

    protected List<ConsultationResponseDto> consultationListToConsultationResponseDtoList(List<Consultation> list) {
        if ( list == null ) {
            return null;
        }

        List<ConsultationResponseDto> list1 = new ArrayList<ConsultationResponseDto>( list.size() );
        for ( Consultation consultation : list ) {
            list1.add( consultationToConsultationResponseDto( consultation ) );
        }

        return list1;
    }
}
