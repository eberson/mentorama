package br.com.mentorama.agenda.resource;

import br.com.mentorama.agenda.dto.ContactDTO;
import br.com.mentorama.agenda.dto.CreateContactDTO;
import br.com.mentorama.agenda.dto.UpdateContactDTO;
import br.com.mentorama.agenda.service.CreateContactService;
import br.com.mentorama.agenda.service.UpdateContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactResource {

    private final CreateContactService createContactService;
    private final UpdateContactService updateContactService;

    @PostMapping
    public ContactDTO create(@RequestBody @Valid CreateContactDTO request) {
        return createContactService.create(request);
    }

    @PutMapping("/{id}")
    public ContactDTO update(@PathVariable("id") String uuid, @RequestBody @Valid UpdateContactDTO request) {
        return updateContactService.update(uuid, request);
    }
}
