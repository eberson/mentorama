package br.com.mentorama.agenda.dto;

import br.com.mentorama.agenda.entity.PhoneType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContactDTO {

    private String id;
    private String name;
    private String email;
    private String phone;
    private PhoneType phoneType;
    private LocalDate birthDate;

}
