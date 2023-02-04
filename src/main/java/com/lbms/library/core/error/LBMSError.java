package com.lbms.library.core.error;

public enum LBMSError implements ThrowableError{
    MEMBER_EXISTS("LBMSVAL0001","Member exists with the email address"),
    MEMBER_DOES_NOT_EXIST("LBMSVAL0002","A member with the user id does not exist");

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
