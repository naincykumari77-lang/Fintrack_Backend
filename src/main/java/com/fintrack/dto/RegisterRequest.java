package com.fintrack.dto; import jakarta.validation.constraints.*;
public record RegisterRequest(@NotBlank String name,@NotBlank @Email String email,String phone,@NotBlank @Size(min=6) String password){}
