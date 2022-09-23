package com.example.lesson7task1.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    @NotNull(message = "Enter the First name")
    private String firstname;
    @NotNull(message = "Enter the Last name")
    private String lastname;
    @NotNull(message = "Enter the Phone number")
    private String phone;
    @NotNull(message = "Enter the user name")
    private String username;
    @NotNull(message = "Enter the password ")
    private String password;

    private Long roleId;

}
