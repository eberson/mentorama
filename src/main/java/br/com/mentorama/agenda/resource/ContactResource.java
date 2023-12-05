package br.com.mentorama.agenda.resource;

import br.com.mentorama.agenda.dto.ContactDTO;
import br.com.mentorama.agenda.dto.CreateContactDTO;
import br.com.mentorama.agenda.dto.UpdateContactDTO;
import br.com.mentorama.agenda.entity.Contact;
import br.com.mentorama.agenda.service.CreateContactService;
import br.com.mentorama.agenda.service.QueryContactService;
import br.com.mentorama.agenda.service.UpdateContactService;
import com.querydsl.core.types.Predicate;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactResource {

    private final CreateContactService createContactService;
    private final UpdateContactService updateContactService;
    private final QueryContactService queryContactService;

    @PostMapping
    public ContactDTO create(@RequestBody @Valid CreateContactDTO request) {
        return createContactService.create(request);
    }

    @PutMapping("/{id}")
    public ContactDTO update(@PathVariable("id") String uuid, @RequestBody @Valid UpdateContactDTO request) {
        return updateContactService.update(uuid, request);
    }

    @GetMapping
    public List<ContactDTO> query(@ParameterObject Pageable pageable,
                                  @QuerydslPredicate(root = Contact.class) Predicate predicate) {
        return queryContactService.getAll(predicate, pageable);
    }
}
