package com.userapplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.userapplication.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByFirstName(String username);

	//Boolean existsByBoolean(String username);

	Boolean existsByEmail(String email);
}
