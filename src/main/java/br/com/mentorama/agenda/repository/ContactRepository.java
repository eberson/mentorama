package br.com.mentorama.agenda.repository;

import br.com.mentorama.agenda.entity.Contact;
import br.com.mentorama.agenda.entity.QContact;
import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long>, QuerydslPredicateExecutor<Contact>, QuerydslBinderCustomizer<QContact> {

    @Override
    default void customize(QuerydslBindings bindings, QContact root) {
        bindings.excluding(root.id);
        bindings.excluding(root.email);
        bindings.bind(root.name).first(StringExpression::containsIgnoreCase);
    }

    Optional<Contact> findByUuid(String uuid);

}
