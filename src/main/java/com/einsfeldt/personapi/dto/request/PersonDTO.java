package com.einsfeldt.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

// Classe para tratar e validar campos antes de banco de dados
// DTO significa Data Transfer Object
// Este DTO trata pessoas
public class PersonDTO {

    // Chave Primaria
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF  // Funciona nacionalizado
    private String cpf;

    @NotNull
    private String birthDate;

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
