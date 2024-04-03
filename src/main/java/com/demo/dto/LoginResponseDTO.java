package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
public class LoginResponseDTO {
    private String token;
    private String email;
    private Integer accessCode;
    private String accessName;
    private String accessDescription;
    @Nullable
    private String username;
}