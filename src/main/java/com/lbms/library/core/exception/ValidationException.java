package com.lbms.library.core.exception;

import com.lbms.library.core.error.ThrowableError;

public class ValidationException extends RuntimeException {

    private ThrowableError throwableError;

    public ValidationException() {
        super();
    }

    public ValidationException(ThrowableError throwableError) {
        super(throwableError.getMessage());
        this.throwableError=throwableError;
    }
}
