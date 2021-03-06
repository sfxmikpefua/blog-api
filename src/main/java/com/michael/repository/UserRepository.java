package com.michael.repository;

import com.michael.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmailAndPassword(String email, String password);

//    boolean existsByEmail(String email);

    boolean existsUsersByEmail(String email);


    List<User> findByIdIn(List<Long> ids);


}
