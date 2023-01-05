package com.lbms.library.exception;

public class LBMSException extends Exception{
    private ThrowableError throwableError;

    public LBMSException() {

    }

    public LBMSException(ThrowableError throwableError) {
        super(throwableError.getMessage());
        this.throwableError = throwableError;
    }
}
