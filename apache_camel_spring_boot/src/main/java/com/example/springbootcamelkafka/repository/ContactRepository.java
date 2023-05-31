package com.example.springbootcamelkafka.repository;

import com.example.springbootcamelkafka.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
}
