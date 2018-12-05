package com.example.practicejwt2.repository;

import com.example.practicejwt2.model.Contact;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
    List<Contact> findAll();
}
