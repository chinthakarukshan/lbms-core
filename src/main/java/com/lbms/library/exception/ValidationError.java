package com.lbms.library.exception;

public enum ValidationError implements ThrowableError{
    ;

    ValidationError(final String code, final String message) {
        this.code = code;
        this.message = message;
    }
    private String code;
    private String message;

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
