package com.psycare.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRegisterRequest {
    private String token;
    private String password;
    private String name;
    private String surname;
    private LocalDate dob;
    private String phone;
}
