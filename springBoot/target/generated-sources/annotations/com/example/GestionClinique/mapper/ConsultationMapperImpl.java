package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.ConsultationRequestDto;
import com.example.GestionClinique.dto.RequestDto.PrescriptionRequestDto;
import com.example.GestionClinique.dto.ResponseDto.ConsultationResponseDto;
import com.example.GestionClinique.model.entity.Consultation;
import com.example.GestionClinique.model.entity.Prescription;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:16+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ConsultationMapperImpl implements ConsultationMapper {

    @Autowired
    private PrescriptionMapper prescriptionMapper;

    @Override
    public Consultation toEntity(ConsultationRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Consultation consultation = new Consultation();

        consultation.setPrescriptions( prescriptionRequestDtoListToPrescriptionList( dto.getPrescriptions() ) );
        consultation.setCompteRendu( dto.getCompteRendu() );
        consultation.setDiagnostic( dto.getDiagnostic() );
        consultation.setMotifs( dto.getMotifs() );
        consultation.setPoids( dto.getPoids() );
        consultation.setTaille( dto.getTaille() );
        consultation.setTemperature( dto.getTemperature() );
        consultation.setTensionArterielle( dto.getTensionArterielle() );

        return consultation;
    }

    @Override
    public ConsultationResponseDto toDto(Consultation entity) {
        if ( entity == null ) {
            return null;
        }

        ConsultationResponseDto consultationResponseDto = new ConsultationResponseDto();

        consultationResponseDto.setPrescriptions( prescriptionMapper.toDtoList( entity.getPrescriptions() ) );
        consultationResponseDto.setCreationDate( entity.getCreationDate() );
        consultationResponseDto.setId( entity.getId() );
        consultationResponseDto.setModificationDate( entity.getModificationDate() );
        consultationResponseDto.setCompteRendu( entity.getCompteRendu() );
        consultationResponseDto.setDiagnostic( entity.getDiagnostic() );
        consultationResponseDto.setMotifs( entity.getMotifs() );
        consultationResponseDto.setPoids( entity.getPoids() );
        consultationResponseDto.setTaille( entity.getTaille() );
        consultationResponseDto.setTemperature( entity.getTemperature() );
        consultationResponseDto.setTensionArterielle( entity.getTensionArterielle() );

        consultationResponseDto.setMedecinNomComplet( entity.getMedecin() != null ? entity.getMedecin().getNom() + " " + entity.getMedecin().getPrenom() : null );
        consultationResponseDto.setPatientNomComplet( entity.getDossierMedical() != null && entity.getDossierMedical().getPatient() != null ? entity.getDossierMedical().getPatient().getNom() + " " + entity.getDossierMedical().getPatient().getPrenom() : null );
        consultationResponseDto.setServiceMedecin( entity.getMedecin() != null && entity.getMedecin().getServiceMedical() != null ? entity.getMedecin().getServiceMedical().name() : null );

        return consultationResponseDto;
    }

    @Override
    public List<ConsultationResponseDto> toDtoList(List<Consultation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ConsultationResponseDto> list = new ArrayList<ConsultationResponseDto>( entities.size() );
        for ( Consultation consultation : entities ) {
            list.add( toDto( consultation ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDto(ConsultationRequestDto dto, Consultation entity) {
        if ( dto == null ) {
            return;
        }

        if ( entity.getPrescriptions() != null ) {
            List<Prescription> list = prescriptionRequestDtoListToPrescriptionList( dto.getPrescriptions() );
            if ( list != null ) {
                entity.getPrescriptions().clear();
                entity.getPrescriptions().addAll( list );
            }
        }
        else {
            List<Prescription> list = prescriptionRequestDtoListToPrescriptionList( dto.getPrescriptions() );
            if ( list != null ) {
                entity.setPrescriptions( list );
            }
        }
        if ( dto.getCompteRendu() != null ) {
            entity.setCompteRendu( dto.getCompteRendu() );
        }
        if ( dto.getDiagnostic() != null ) {
            entity.setDiagnostic( dto.getDiagnostic() );
        }
        if ( dto.getMotifs() != null ) {
            entity.setMotifs( dto.getMotifs() );
        }
        if ( dto.getPoids() != null ) {
            entity.setPoids( dto.getPoids() );
        }
        if ( dto.getTaille() != null ) {
            entity.setTaille( dto.getTaille() );
        }
        if ( dto.getTemperature() != null ) {
            entity.setTemperature( dto.getTemperature() );
        }
        if ( dto.getTensionArterielle() != null ) {
            entity.setTensionArterielle( dto.getTensionArterielle() );
        }
    }

    protected List<Prescription> prescriptionRequestDtoListToPrescriptionList(List<PrescriptionRequestDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Prescription> list1 = new ArrayList<Prescription>( list.size() );
        for ( PrescriptionRequestDto prescriptionRequestDto : list ) {
            list1.add( prescriptionMapper.toEntity( prescriptionRequestDto ) );
        }

        return list1;
    }
}
