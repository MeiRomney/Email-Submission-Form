package com.email_submission_form.fullstack_backend.repository;

import com.email_submission_form.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
