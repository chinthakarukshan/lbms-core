package com.lbms.library.core.exception;

import com.lbms.library.core.error.ThrowableError;

public class LBMSException extends RuntimeException{
    private ThrowableError throwableError;

    public LBMSException() {

    }

    public LBMSException(ThrowableError throwableError) {
        super(throwableError.getMessage());
        this.throwableError = throwableError;
    }
}
