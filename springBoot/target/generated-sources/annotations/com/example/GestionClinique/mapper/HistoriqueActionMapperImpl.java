package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.HistoriqueActionRequestDto;
import com.example.GestionClinique.dto.ResponseDto.HistoriqueActionResponseDto;
import com.example.GestionClinique.model.entity.HistoriqueAction;
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
public class HistoriqueActionMapperImpl implements HistoriqueActionMapper {

    @Autowired
    private UtilisateurMapper utilisateurMapper;

    @Override
    public HistoriqueAction toEntity(HistoriqueActionRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        HistoriqueAction historiqueAction = new HistoriqueAction();

        historiqueAction.setAction( dto.getAction() );
        historiqueAction.setDate( dto.getDate() );

        return historiqueAction;
    }

    @Override
    public HistoriqueActionResponseDto toDto(HistoriqueAction entity) {
        if ( entity == null ) {
            return null;
        }

        HistoriqueActionResponseDto historiqueActionResponseDto = new HistoriqueActionResponseDto();

        historiqueActionResponseDto.setUtilisateur( utilisateurMapper.toDto( entity.getUtilisateur() ) );
        historiqueActionResponseDto.setCreationDate( entity.getCreationDate() );
        historiqueActionResponseDto.setId( entity.getId() );
        historiqueActionResponseDto.setModificationDate( entity.getModificationDate() );
        historiqueActionResponseDto.setAction( entity.getAction() );
        historiqueActionResponseDto.setDate( entity.getDate() );

        return historiqueActionResponseDto;
    }

    @Override
    public List<HistoriqueActionResponseDto> toDtoList(List<HistoriqueAction> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HistoriqueActionResponseDto> list = new ArrayList<HistoriqueActionResponseDto>( entities.size() );
        for ( HistoriqueAction historiqueAction : entities ) {
            list.add( toDto( historiqueAction ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDto(HistoriqueActionRequestDto dto, HistoriqueAction entity) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getAction() != null ) {
            entity.setAction( dto.getAction() );
        }
        if ( dto.getDate() != null ) {
            entity.setDate( dto.getDate() );
        }
    }
}
