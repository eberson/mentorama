package br.com.mentorama.agenda.mapper;

import br.com.mentorama.agenda.dto.ContactDTO;
import br.com.mentorama.agenda.dto.CreateContactDTO;
import br.com.mentorama.agenda.dto.UpdateContactDTO;
import br.com.mentorama.agenda.entity.Contact;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface ContactMapper {

    Contact fromCreateDTO(CreateContactDTO dto);

    Contact fromUpdateDTO(UpdateContactDTO dto);

    @Mapping(target = "id", source = "uuid")
    ContactDTO toContactDTO(Contact contact);

}
