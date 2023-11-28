package br.com.mentorama.agenda.service;

import br.com.mentorama.agenda.dto.ContactDTO;
import br.com.mentorama.agenda.dto.CreateContactDTO;
import br.com.mentorama.agenda.dto.UpdateContactDTO;
import br.com.mentorama.agenda.mapper.ContactMapper;
import br.com.mentorama.agenda.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateContactService {

    private final ContactRepository repository;
    private final ContactMapper mapper;

    @Transactional
    public ContactDTO update(String uuid, UpdateContactDTO request) {
        var contact = repository.findByUuid(uuid)
                .orElseThrow(() -> new IllegalArgumentException("Contato não encontrado"));

        contact.setEmail(request.getEmail());
        contact.setName(request.getName());
        contact.setPhone(request.getPhone());
        contact.setPhoneType(request.getPhoneType());
        contact.setBirthDate(request.getBirthDate());

        var saved = repository.save(contact);
        return mapper.toContactDTO(saved);
    }

}
