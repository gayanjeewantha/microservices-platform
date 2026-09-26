package com.gayan.platform.userservice.controller;

import com.gayan.platform.userservice.dto.UserDTO;
import com.gayan.platform.userservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public UserDTO create(@RequestBody UserDTO userDTO) {
        return userService.create(userDTO);
    }
}