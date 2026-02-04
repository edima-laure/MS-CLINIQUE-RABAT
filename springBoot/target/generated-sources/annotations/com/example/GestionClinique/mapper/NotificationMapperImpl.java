package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.NotificationRequestDto;
import com.example.GestionClinique.dto.ResponseDto.NotificationResponseDto;
import com.example.GestionClinique.model.entity.Message;
import com.example.GestionClinique.model.entity.Notification;
import com.example.GestionClinique.model.entity.RendezVous;
import com.example.GestionClinique.model.entity.Utilisateur;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public NotificationResponseDto toDto(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationResponseDto notificationResponseDto = new NotificationResponseDto();

        notificationResponseDto.setUtilisateurId( notificationUtilisateurId( notification ) );
        notificationResponseDto.setMessageId( notificationMessageId( notification ) );
        notificationResponseDto.setRendezVousId( notificationRendezVousId( notification ) );
        notificationResponseDto.setCreationDate( notification.getCreationDate() );
        notificationResponseDto.setId( notification.getId() );
        notificationResponseDto.setModificationDate( notification.getModificationDate() );
        notificationResponseDto.setContenu( notification.getContenu() );
        notificationResponseDto.setDateCreation( notification.getDateCreation() );
        notificationResponseDto.setLu( notification.isLu() );
        notificationResponseDto.setType( notification.getType() );

        return notificationResponseDto;
    }

    @Override
    public Notification toEntity(NotificationRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setContenu( dto.getContenu() );
        notification.setType( dto.getType() );

        return notification;
    }

    @Override
    public List<NotificationResponseDto> toDtos(List<Notification> notifications) {
        if ( notifications == null ) {
            return null;
        }

        List<NotificationResponseDto> list = new ArrayList<NotificationResponseDto>( notifications.size() );
        for ( Notification notification : notifications ) {
            list.add( toDto( notification ) );
        }

        return list;
    }

    private Long notificationUtilisateurId(Notification notification) {
        if ( notification == null ) {
            return null;
        }
        Utilisateur utilisateur = notification.getUtilisateur();
        if ( utilisateur == null ) {
            return null;
        }
        Long id = utilisateur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long notificationMessageId(Notification notification) {
        if ( notification == null ) {
            return null;
        }
        Message message = notification.getMessage();
        if ( message == null ) {
            return null;
        }
        Long id = message.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long notificationRendezVousId(Notification notification) {
        if ( notification == null ) {
            return null;
        }
        RendezVous rendezVous = notification.getRendezVous();
        if ( rendezVous == null ) {
            return null;
        }
        Long id = rendezVous.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
