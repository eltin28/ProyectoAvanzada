package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterDTO {
    private String email;
    private String password;
    private String idNumber;
    private String names;
    private String lastNames;
    @Nullable
    private String address;
    @Nullable
    private String phoneNumber;
}
