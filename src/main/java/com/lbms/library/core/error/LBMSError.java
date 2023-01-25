package com.lbms.library.core.error;

public enum LBMSError implements ThrowableError{
    ;

    LBMSError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
