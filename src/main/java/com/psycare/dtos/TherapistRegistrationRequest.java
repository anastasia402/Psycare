package com.psycare.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TherapistRegistrationRequest {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;
    private LocalDate dob;
    private String licenseNumber;
}
