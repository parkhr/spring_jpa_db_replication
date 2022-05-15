package com.example.study;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void getUsers() {
        List<User> findUsers = userRepository.findAll();
        System.out.println(findUsers);
    }
}
