package com.einsfeldt.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

// Enumerate para delimitar valores validos para o atributo tipo de telefone
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
