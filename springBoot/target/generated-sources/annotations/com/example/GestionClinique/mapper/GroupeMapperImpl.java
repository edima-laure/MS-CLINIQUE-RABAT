package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.messageRequestDto.GroupeRequestDto;
import com.example.GestionClinique.dto.ResponseDto.messageResponseDto.GroupeResponseDto;
import com.example.GestionClinique.model.entity.Groupe;
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
public class GroupeMapperImpl implements GroupeMapper {

    @Autowired
    private UtilisateurMapper utilisateurMapper;

    @Override
    public Groupe toEntity(GroupeRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Groupe groupe = new Groupe();

        groupe.setDescription( dto.getDescription() );
        groupe.setNom( dto.getNom() );

        return groupe;
    }

    @Override
    public GroupeResponseDto toDto(Groupe entity) {
        if ( entity == null ) {
            return null;
        }

        GroupeResponseDto groupeResponseDto = new GroupeResponseDto();

        groupeResponseDto.setCreateur( utilisateurMapper.toDto( entity.getCreateur() ) );
        groupeResponseDto.setCreationDate( entity.getCreationDate() );
        groupeResponseDto.setId( entity.getId() );
        groupeResponseDto.setModificationDate( entity.getModificationDate() );
        groupeResponseDto.setDescription( entity.getDescription() );
        groupeResponseDto.setMembres( utilisateurMapper.toDtoList( entity.getMembres() ) );
        groupeResponseDto.setNom( entity.getNom() );

        return groupeResponseDto;
    }

    @Override
    public List<GroupeResponseDto> toDtoList(List<Groupe> entities) {
        if ( entities == null ) {
            return null;
        }

        List<GroupeResponseDto> list = new ArrayList<GroupeResponseDto>( entities.size() );
        for ( Groupe groupe : entities ) {
            list.add( toDto( groupe ) );
        }

        return list;
    }
}
