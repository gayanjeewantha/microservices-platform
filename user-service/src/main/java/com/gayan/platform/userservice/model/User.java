package com.gayan.platform.userservice.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
}
