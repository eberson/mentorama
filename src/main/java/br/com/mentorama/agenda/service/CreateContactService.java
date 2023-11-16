package br.com.mentorama.agenda.service;

import br.com.mentorama.agenda.entity.Contact;

public class CreateContactService {

    public void create() {
        var contact = new Contact();

        contact.setName("Jose da Silva");
        contact.setEmail("jose.silva@gmail.com");
    }

}
