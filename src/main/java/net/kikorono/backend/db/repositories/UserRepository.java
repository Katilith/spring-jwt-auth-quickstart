package net.kikorono.backend.db.repositories;

import net.kikorono.backend.db.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    /**
     * Find a user by username.
     * @param username The username to search for.
     * @return The UserEntity matching the given username, if one was found.
     */
    Optional<UserEntity> findByUsername(String username);

    /**
     * Validates if a username already exists in the database.
     * @param username The username to search for.
     * @return True if the username already exists, false if not.
     */
    Boolean existsByUsername(String username);

    /**
     * Validates if an email address already exists in the database.
     * @param email The email address to search for.
     * @return True if the email address already exists, false if not.
     */
    Boolean existsByEmail(String email);
}
