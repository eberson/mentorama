package br.com.mentorama.agenda.service;

import br.com.mentorama.agenda.dto.ContactDTO;
import br.com.mentorama.agenda.dto.CreateContactDTO;
import br.com.mentorama.agenda.entity.Contact;
import br.com.mentorama.agenda.mapper.ContactMapper;
import br.com.mentorama.agenda.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateContactService {

    private final ContactRepository repository;
    private final ContactMapper mapper;

    @Transactional
    public ContactDTO create(CreateContactDTO request) {
        var contact = repository.save(mapper.fromCreateDTO(request));
        return mapper.toContactDTO(contact);
    }

}
