package br.com.mentorama.agenda.repository;

import br.com.mentorama.agenda.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
