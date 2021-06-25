package com.einsfeldt.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.einsfeldt.personapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

// Classe para tratar e validar campos antes de banco de dados
// DTO significa Data Transfer Object
// Este DTO trata Telefones
public class PhoneDTO {

    // Chave primaria
    private Long id;

    // Correlaciona o enumerate criado no PhoneType
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;
}
