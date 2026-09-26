package com.gayan.platform.userservice.service;

import com.gayan.platform.userservice.model.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    private final Map<Long, User> users = new HashMap<>();

    public List<User> getAll() {
        return new ArrayList<>(users.values());
    }

    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }
}