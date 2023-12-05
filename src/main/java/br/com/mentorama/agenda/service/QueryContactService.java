package br.com.mentorama.agenda.service;

import br.com.mentorama.agenda.dto.ContactDTO;
import br.com.mentorama.agenda.entity.QContact;
import br.com.mentorama.agenda.mapper.ContactMapper;
import br.com.mentorama.agenda.repository.ContactRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class QueryContactService {

    private final ContactRepository repository;
    private final ContactMapper mapper;

    public List<ContactDTO> getByName(String name) {
        var query = QContact.contact;

        var predicate = query.name.likeIgnoreCase(name);

        return StreamSupport.stream(repository.findAll(predicate).spliterator(), false)
                .map(mapper::toContactDTO)
                .toList();
    }

    public List<ContactDTO> getAll(Predicate predicate, Pageable pageable) {
        var page = repository.findAll(predicate, pageable);


        return page.getContent()
                .stream()
                .map(mapper::toContactDTO)
                .toList();
    }

}
