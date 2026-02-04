package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.ResponseDto.messageResponseDto.HistoriqueMessageResponseDto;
import com.example.GestionClinique.model.entity.HistoriqueMessage;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class HistoriqueMessageMapperImpl implements HistoriqueMessageMapper {

    @Autowired
    private UtilisateurMapper utilisateurMapper;

    @Override
    public HistoriqueMessageResponseDto toDto(HistoriqueMessage entity) {
        if ( entity == null ) {
            return null;
        }

        HistoriqueMessageResponseDto historiqueMessageResponseDto = new HistoriqueMessageResponseDto();

        historiqueMessageResponseDto.setCreationDate( entity.getCreationDate() );
        historiqueMessageResponseDto.setId( entity.getId() );
        historiqueMessageResponseDto.setModificationDate( entity.getModificationDate() );
        historiqueMessageResponseDto.setActeur( utilisateurMapper.toDto( entity.getActeur() ) );
        historiqueMessageResponseDto.setNewContent( entity.getNewContent() );
        historiqueMessageResponseDto.setPreviousContent( entity.getPreviousContent() );

        historiqueMessageResponseDto.setAction( entity.getAction().name() );

        return historiqueMessageResponseDto;
    }
}
