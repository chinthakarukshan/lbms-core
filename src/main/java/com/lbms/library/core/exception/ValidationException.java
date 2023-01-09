package com.lbms.library.core.exception;

public class ValidationException extends Exception{

    private ThrowableError throwableError;

    public ValidationException() {
        super();
    }

    public ValidationException(ThrowableError throwableError) {
        super(throwableError.getMessage());
        this.throwableError=throwableError;
    }
}
