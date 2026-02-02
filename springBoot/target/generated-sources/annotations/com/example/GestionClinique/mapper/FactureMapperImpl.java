package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.FactureRequestDto;
import com.example.GestionClinique.dto.ResponseDto.FactureResponseDto;
import com.example.GestionClinique.model.entity.Facture;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-02T21:48:42+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class FactureMapperImpl implements FactureMapper {

    private final DatatypeFactory datatypeFactory;

    public FactureMapperImpl() {
        try {
            datatypeFactory = DatatypeFactory.newInstance();
        }
        catch ( DatatypeConfigurationException ex ) {
            throw new RuntimeException( ex );
        }
    }

    @Override
    public Facture toEntity(FactureRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Facture facture = new Facture();

        facture.setDateEmission( xmlGregorianCalendarToLocalDateTime( localDateToXmlGregorianCalendar( dto.getDateEmission() ) ) );
        facture.setModePaiement( dto.getModePaiement() );
        facture.setMontant( dto.getMontant() );
        facture.setStatutPaiement( dto.getStatutPaiement() );

        return facture;
    }

    @Override
    public FactureResponseDto toDto(Facture entity) {
        if ( entity == null ) {
            return null;
        }

        FactureResponseDto factureResponseDto = new FactureResponseDto();

        factureResponseDto.setCreationDate( entity.getCreationDate() );
        factureResponseDto.setId( entity.getId() );
        factureResponseDto.setModificationDate( entity.getModificationDate() );
        factureResponseDto.setDateEmission( entity.getDateEmission() );
        factureResponseDto.setModePaiement( entity.getModePaiement() );
        factureResponseDto.setMontant( entity.getMontant() );
        factureResponseDto.setStatutPaiement( entity.getStatutPaiement() );

        factureResponseDto.setPatientNomComplet( entity.getPatient() != null ? entity.getPatient().getNom() + " " + entity.getPatient().getPrenom() : null );
        factureResponseDto.setServiceMedicalNom( getServiceMedicalName(entity) );

        return factureResponseDto;
    }

    @Override
    public List<FactureResponseDto> toDtoList(List<Facture> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FactureResponseDto> list = new ArrayList<FactureResponseDto>( entities.size() );
        for ( Facture facture : entities ) {
            list.add( toDto( facture ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDto(FactureRequestDto dto, Facture entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getDateEmission() != null ) {
            entity.setDateEmission( xmlGregorianCalendarToLocalDateTime( localDateToXmlGregorianCalendar( dto.getDateEmission() ) ) );
        }
        if ( dto.getModePaiement() != null ) {
            entity.setModePaiement( dto.getModePaiement() );
        }
        if ( dto.getMontant() != null ) {
            entity.setMontant( dto.getMontant() );
        }
        if ( dto.getStatutPaiement() != null ) {
            entity.setStatutPaiement( dto.getStatutPaiement() );
        }
    }

    private XMLGregorianCalendar localDateToXmlGregorianCalendar( LocalDate localDate ) {
        if ( localDate == null ) {
            return null;
        }

        return datatypeFactory.newXMLGregorianCalendarDate(
            localDate.getYear(),
            localDate.getMonthValue(),
            localDate.getDayOfMonth(),
            DatatypeConstants.FIELD_UNDEFINED );
    }

    private static LocalDateTime xmlGregorianCalendarToLocalDateTime( XMLGregorianCalendar xcal ) {
        if ( xcal == null ) {
            return null;
        }

        if ( xcal.getYear() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMonth() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getDay() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getHour() != DatatypeConstants.FIELD_UNDEFINED
            && xcal.getMinute() != DatatypeConstants.FIELD_UNDEFINED
        ) {
            if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED
                && xcal.getMillisecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond(),
                    Duration.ofMillis( xcal.getMillisecond() ).getNano()
                );
            }
            else if ( xcal.getSecond() != DatatypeConstants.FIELD_UNDEFINED ) {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute(),
                    xcal.getSecond()
                );
            }
            else {
                return LocalDateTime.of(
                    xcal.getYear(),
                    xcal.getMonth(),
                    xcal.getDay(),
                    xcal.getHour(),
                    xcal.getMinute()
                );
            }
        }
        return null;
    }
}
