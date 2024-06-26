package com.sergiobumer.smjob.userservice.repository;

import com.sergiobumer.smjob.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
