package com.example.GestionClinique.mapper;

import com.example.GestionClinique.dto.RequestDto.messageRequestDto.MessageRequestDto;
import com.example.GestionClinique.dto.ResponseDto.messageResponseDto.MessageResponseDto;
import com.example.GestionClinique.model.entity.Conversation;
import com.example.GestionClinique.model.entity.Message;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-04T17:57:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class MessageMapperImpl implements MessageMapper {

    @Autowired
    private UtilisateurMapper utilisateurMapper;

    @Override
    public Message toEntity(MessageRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        Message message = new Message();

        message.setContenu( dto.getContenu() );
        message.setLu( dto.isLu() );

        return message;
    }

    @Override
    public MessageResponseDto toDto(Message entity) {
        if ( entity == null ) {
            return null;
        }

        MessageResponseDto messageResponseDto = new MessageResponseDto();

        messageResponseDto.setExpediteur( utilisateurMapper.toDto( entity.getExpediteur() ) );
        messageResponseDto.setConversationId( entityConversationId( entity ) );
        messageResponseDto.setCreationDate( entity.getCreationDate() );
        messageResponseDto.setId( entity.getId() );
        messageResponseDto.setModificationDate( entity.getModificationDate() );
        messageResponseDto.setContenu( entity.getContenu() );
        messageResponseDto.setLu( entity.isLu() );

        return messageResponseDto;
    }

    @Override
    public void updateEntityFromDto(MessageRequestDto dto, Message entity) {
        if ( dto == null ) {
            return;
        }

        entity.setContenu( dto.getContenu() );
        entity.setLu( dto.isLu() );
    }

    private Long entityConversationId(Message message) {
        if ( message == null ) {
            return null;
        }
        Conversation conversation = message.getConversation();
        if ( conversation == null ) {
            return null;
        }
        Long id = conversation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
