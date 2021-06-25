package com.einsfeldt.personapi.repositories;

import com.einsfeldt.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
