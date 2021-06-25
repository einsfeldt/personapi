package com.einsfeldt.personapi.dto.mapper;

import com.einsfeldt.personapi.dto.request.PersonDTO;
import com.einsfeldt.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

// Facilidade inclusa pela biblioteca de comunidade mapstruct
public interface PersonMapper {

    // Mapeia o DTO entidade para entidade
    // Esta conversao e' necessaria por conta da tipagem de dados do banco
    // ser diferente do tipo de dados da entidade
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    // Mapeia a entidade para DTO
    PersonDTO toDTO(Person dto);
}
