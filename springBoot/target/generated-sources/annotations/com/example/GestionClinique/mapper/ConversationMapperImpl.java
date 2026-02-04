package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.messageRequestDto.ConversationRequestDto;
import com.example.GestionClinique.dto.ResponseDto.UtilisateurResponseDto;
import com.example.GestionClinique.dto.ResponseDto.messageResponseDto.ConversationResponseDto;
import com.example.GestionClinique.model.entity.Conversation;
import com.example.GestionClinique.model.entity.ConversationParticipant;
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
public class ConversationMapperImpl extends ConversationMapper {

    @Autowired
    private GroupeMapper groupeMapper;

    @Override
    public Conversation toEntity(ConversationRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Conversation conversation = new Conversation();

        conversation.setParticipants( mapParticipantIdsToParticipants( dto.getParticipantIds() ) );
        conversation.setTitre( dto.getTitre() );
        conversation.setTypeConversation( dto.getTypeConversation() );

        return conversation;
    }

    @Override
    public ConversationResponseDto toDto(Conversation entity) {
        if ( entity == null ) {
            return null;
        }

        ConversationResponseDto conversationResponseDto = new ConversationResponseDto();

        conversationResponseDto.setTypeConversation( entity.getTypeConversation() );
        conversationResponseDto.setParticipants( conversationParticipantListToUtilisateurResponseDtoList( entity.getParticipants() ) );
        conversationResponseDto.setLastMessageAt( entity.getLastMessageAt() );
        conversationResponseDto.setCreationDate( entity.getCreationDate() );
        conversationResponseDto.setId( entity.getId() );
        conversationResponseDto.setModificationDate( entity.getModificationDate() );
        conversationResponseDto.setGroupe( groupeMapper.toDto( entity.getGroupe() ) );
        conversationResponseDto.setTitre( entity.getTitre() );

        return conversationResponseDto;
    }

    @Override
    public List<ConversationResponseDto> toDtoList(List<Conversation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ConversationResponseDto> list = new ArrayList<ConversationResponseDto>( entities.size() );
        for ( Conversation conversation : entities ) {
            list.add( toDto( conversation ) );
        }

        return list;
    }

    protected List<UtilisateurResponseDto> conversationParticipantListToUtilisateurResponseDtoList(List<ConversationParticipant> list) {
        if ( list == null ) {
            return null;
        }

        List<UtilisateurResponseDto> list1 = new ArrayList<UtilisateurResponseDto>( list.size() );
        for ( ConversationParticipant conversationParticipant : list ) {
            list1.add( map( conversationParticipant ) );
        }

        return list1;
    }
}
