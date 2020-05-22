package com.merlinreactor.chatserver.repositories;

import com.merlinreactor.chatserver.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastname(String lastName);

    User findById(long id);
}

