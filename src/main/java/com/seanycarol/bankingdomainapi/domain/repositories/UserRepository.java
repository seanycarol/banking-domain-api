package com.seanycarol.bankingdomainapi.domain.repositories;

import com.seanycarol.bankingdomainapi.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
