package com.lbms.library.core.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Member {
    private String email;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;

    private String membership;
}
