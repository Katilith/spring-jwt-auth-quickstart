package net.kikorono.backend.controllers;

import net.kikorono.backend.db.entities.UserEntity;
import net.kikorono.backend.db.repositories.UserRepository;
import net.kikorono.backend.dto.UserInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public UserInfoResponse getUser(Authentication authentication, Principal principal) {
        String username = authentication.getName();
        if (username != null) {
            Optional<UserEntity> user = userRepository.findByUsername(username);
            if (user.isPresent()) {
                UserEntity userEntity = user.get();
                UserInfoResponse response = new UserInfoResponse(
                        userEntity.getId(),
                        userEntity.getUsername(),
                        userEntity.getEmail()
                );
                return response;
            }
        }
        return null;
    }

}
