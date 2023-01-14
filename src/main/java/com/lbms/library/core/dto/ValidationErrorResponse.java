package com.lbms.library.core.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class ValidationErrorResponse {
    private String errorCode;

    private List<String> errorMessage;
}
