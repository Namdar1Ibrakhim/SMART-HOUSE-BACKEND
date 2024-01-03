package com.example.smarthousebackend.config;


import com.example.smarthousebackend.entity.User;
import com.example.smarthousebackend.enums.Role;
import com.example.smarthousebackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class AdminUserInitializer implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if(!userRepository.findByEmail("inzhushakhidani@gmail.com").isPresent()) {
            var adminUser = User.builder()
                    .firstname("Inzhu")
                    .lastname("Shakhidani")
                    .email("inzhushakhidani@gmail.com")
                    .password(passwordEncoder.encode("Inzhu&2003"))
                    .role(Role.ADMIN)
                    .build();
            userRepository.save(adminUser);
        }
    }


}
