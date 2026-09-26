package com.gayan.platform.userservice.service;

import com.gayan.platform.userservice.dto.UserDTO;
import com.gayan.platform.userservice.mapper.UserMapper;
import com.gayan.platform.userservice.model.User;
import com.gayan.platform.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UserDTO create(UserDTO dto) {
        User user = UserMapper.toEntity(dto);
        User saved = userRepository.save(user);
        return UserMapper.toDTO(saved);
    }
}