package com.ivoyant.security.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LoginResponse {
    private String jwtToken;
    private String username;
    private List<String> roles;
}
