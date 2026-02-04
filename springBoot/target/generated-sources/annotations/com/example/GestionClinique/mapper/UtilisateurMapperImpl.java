package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.UtilisateurRequestDto;
import com.example.GestionClinique.dto.ResponseDto.UtilisateurResponseDto;
import com.example.GestionClinique.model.entity.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:17+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class UtilisateurMapperImpl implements UtilisateurMapper {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Utilisateur toEntity(UtilisateurRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setServiceMedical( dto.getServiceMedicalName() );
        utilisateur.setAdresse( dto.getAdresse() );
        utilisateur.setDateNaissance( dto.getDateNaissance() );
        utilisateur.setEmail( dto.getEmail() );
        utilisateur.setGenre( dto.getGenre() );
        utilisateur.setNom( dto.getNom() );
        utilisateur.setPrenom( dto.getPrenom() );
        utilisateur.setTelephone( dto.getTelephone() );
        utilisateur.setActif( dto.getActif() );
        utilisateur.setPassword( dto.getPassword() );
        utilisateur.setRole( roleMapper.toEntity( dto.getRole() ) );

        return utilisateur;
    }

    @Override
    public UtilisateurResponseDto toDto(Utilisateur utilisateur) {
        if ( utilisateur == null ) {
            return null;
        }

        UtilisateurResponseDto utilisateurResponseDto = new UtilisateurResponseDto();

        utilisateurResponseDto.setLastLoginDate( utilisateur.getLastLoginDate() );
        utilisateurResponseDto.setLastLogoutDate( utilisateur.getLastLogoutDate() );
        utilisateurResponseDto.setStatusConnect( utilisateur.getStatusConnect() );
        utilisateurResponseDto.setServiceMedicalName( utilisateur.getServiceMedical() );
        utilisateurResponseDto.setRole( roleMapper.toDto( utilisateur.getRole() ) );
        utilisateurResponseDto.setCreationDate( utilisateur.getCreationDate() );
        utilisateurResponseDto.setId( utilisateur.getId() );
        utilisateurResponseDto.setModificationDate( utilisateur.getModificationDate() );
        utilisateurResponseDto.setAdresse( utilisateur.getAdresse() );
        utilisateurResponseDto.setAge( utilisateur.getAge() );
        utilisateurResponseDto.setDateNaissance( utilisateur.getDateNaissance() );
        utilisateurResponseDto.setGenre( utilisateur.getGenre() );
        utilisateurResponseDto.setNom( utilisateur.getNom() );
        utilisateurResponseDto.setPrenom( utilisateur.getPrenom() );
        utilisateurResponseDto.setTelephone( utilisateur.getTelephone() );
        utilisateurResponseDto.setActif( utilisateur.getActif() );
        utilisateurResponseDto.setEmail( utilisateur.getEmail() );
        utilisateurResponseDto.setPhotoProfil( utilisateur.getPhotoProfil() );

        return utilisateurResponseDto;
    }

    @Override
    public List<UtilisateurResponseDto> toDtoList(List<Utilisateur> utilisateurs) {
        if ( utilisateurs == null ) {
            return null;
        }

        List<UtilisateurResponseDto> list = new ArrayList<UtilisateurResponseDto>( utilisateurs.size() );
        for ( Utilisateur utilisateur : utilisateurs ) {
            list.add( toDto( utilisateur ) );
        }

        return list;
    }

    @Override
    public void updateEntityFromDto(UtilisateurRequestDto dto, Utilisateur utilisateur) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getRole() != null ) {
            utilisateur.setRole( roleMapper.toEntity( dto.getRole() ) );
        }
        if ( dto.getServiceMedicalName() != null ) {
            utilisateur.setServiceMedical( dto.getServiceMedicalName() );
        }
        if ( dto.getAdresse() != null ) {
            utilisateur.setAdresse( dto.getAdresse() );
        }
        if ( dto.getDateNaissance() != null ) {
            utilisateur.setDateNaissance( dto.getDateNaissance() );
        }
        if ( dto.getEmail() != null ) {
            utilisateur.setEmail( dto.getEmail() );
        }
        if ( dto.getGenre() != null ) {
            utilisateur.setGenre( dto.getGenre() );
        }
        if ( dto.getNom() != null ) {
            utilisateur.setNom( dto.getNom() );
        }
        if ( dto.getPrenom() != null ) {
            utilisateur.setPrenom( dto.getPrenom() );
        }
        if ( dto.getTelephone() != null ) {
            utilisateur.setTelephone( dto.getTelephone() );
        }
        if ( dto.getActif() != null ) {
            utilisateur.setActif( dto.getActif() );
        }
    }
}
