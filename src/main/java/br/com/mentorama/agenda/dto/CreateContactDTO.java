package br.com.mentorama.agenda.dto;

import br.com.mentorama.agenda.entity.PhoneType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateContactDTO {

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String phone;

    @NotNull
    private PhoneType phoneType;

    private LocalDate birthDate;

}
