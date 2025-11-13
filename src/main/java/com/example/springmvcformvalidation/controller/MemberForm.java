package com.example.springmvcformvalidation.controller;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {

    @NotEmpty
    private String name;

    @NotNull
    @Min(value = 18)
    private Integer age;

    @Pattern(regexp = ".+@.+\\..+")
    private String email;
}