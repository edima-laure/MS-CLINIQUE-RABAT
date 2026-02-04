package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.ResponseDto.stats.StatDuJourResponseDto;
import com.example.GestionClinique.dto.ResponseDto.stats.StatParMoisResponseDto;
import com.example.GestionClinique.dto.ResponseDto.stats.StatsSurLanneeResponseDto;
import com.example.GestionClinique.model.entity.stats.StatDuJour;
import com.example.GestionClinique.model.entity.stats.StatsMois;
import com.example.GestionClinique.model.entity.stats.StatsSurLannee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:17+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class StatMapperImpl implements StatMapper {

    @Override
    public StatDuJourResponseDto toStatDuJourDto(StatDuJour entity) {
        if ( entity == null ) {
            return null;
        }

        StatDuJourResponseDto statDuJourResponseDto = new StatDuJourResponseDto();

        statDuJourResponseDto.setCreationDate( entity.getCreationDate() );
        statDuJourResponseDto.setId( entity.getId() );
        statDuJourResponseDto.setModificationDate( entity.getModificationDate() );
        statDuJourResponseDto.setJour( entity.getJour() );
        statDuJourResponseDto.setNbrConsultation( entity.getNbrConsultation() );
        statDuJourResponseDto.setNbrPatientEnrg( entity.getNbrPatientEnrg() );
        statDuJourResponseDto.setNbrRendezANNULE( entity.getNbrRendezANNULE() );
        statDuJourResponseDto.setNbrRendezVousCONFIRME( entity.getNbrRendezVousCONFIRME() );
        statDuJourResponseDto.setRevenu( entity.getRevenu() );

        return statDuJourResponseDto;
    }

    @Override
    public StatParMoisResponseDto toStatParMoisDto(StatsMois entity) {
        if ( entity == null ) {
            return null;
        }

        StatParMoisResponseDto statParMoisResponseDto = new StatParMoisResponseDto();

        statParMoisResponseDto.setCreationDate( entity.getCreationDate() );
        statParMoisResponseDto.setId( entity.getId() );
        statParMoisResponseDto.setModificationDate( entity.getModificationDate() );
        statParMoisResponseDto.setMois( entity.getMois() );
        statParMoisResponseDto.setNbrConsultation( entity.getNbrConsultation() );
        statParMoisResponseDto.setNbrPatientEnrg( entity.getNbrPatientEnrg() );
        statParMoisResponseDto.setNbrRendezANNULE( entity.getNbrRendezANNULE() );
        statParMoisResponseDto.setNbrRendezVousCONFIRME( entity.getNbrRendezVousCONFIRME() );
        statParMoisResponseDto.setRevenu( entity.getRevenu() );

        return statParMoisResponseDto;
    }

    @Override
    public StatsSurLanneeResponseDto toStatsSurLanneeDto(StatsSurLannee entity) {
        if ( entity == null ) {
            return null;
        }

        StatsSurLanneeResponseDto statsSurLanneeResponseDto = new StatsSurLanneeResponseDto();

        statsSurLanneeResponseDto.setAnnee( entity.getAnnee() );
        statsSurLanneeResponseDto.setCreationDate( entity.getCreationDate() );
        statsSurLanneeResponseDto.setId( entity.getId() );
        statsSurLanneeResponseDto.setModificationDate( entity.getModificationDate() );
        statsSurLanneeResponseDto.setNbrConsultation( entity.getNbrConsultation() );
        statsSurLanneeResponseDto.setNbrPatientEnrg( entity.getNbrPatientEnrg() );
        statsSurLanneeResponseDto.setNbrRendezANNULE( entity.getNbrRendezANNULE() );
        statsSurLanneeResponseDto.setNbrRendezVousCONFIRME( entity.getNbrRendezVousCONFIRME() );
        statsSurLanneeResponseDto.setRevenu( entity.getRevenu() );

        return statsSurLanneeResponseDto;
    }
}
