package com.seanycarol.bankingdomainapi.service;

import com.seanycarol.bankingdomainapi.domain.models.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
