package com.foursys.microservicesendemail.repository;

import com.foursys.microservicesendemail.entities.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<Email, UUID> {
}
