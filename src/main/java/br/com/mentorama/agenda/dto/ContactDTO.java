package br.com.mentorama.agenda.dto;

import br.com.mentorama.agenda.entity.PhoneType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ContactDTO {

    private String id;
    private String name;
    private String email;
    private String phone;
    private PhoneType phoneType;

    @Schema(description = "Data de Nascimento", example = "1984-10-09")
    private LocalDate birthDate;

}
