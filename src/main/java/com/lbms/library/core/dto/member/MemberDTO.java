package com.lbms.library.core.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {
    private String userId;

    private String email;

    private String firstName;

    private String lastName;

    private Date dateOfBirth;
}
