package com.example.restapicontactmanagement.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restapicontactmanagement.dao.entities.Contact;
import java.util.List;
import java.util.Optional;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Long >{
    Optional<Contact> findByEmail(String email);
}