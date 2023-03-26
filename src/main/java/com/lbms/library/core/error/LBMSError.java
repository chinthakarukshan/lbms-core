package com.lbms.library.core.error;

public enum LBMSError implements ThrowableError{
    MEMBER_EXISTS("LBMSVAL0001","Member exists with the email address"),
    MEMBER_DOES_NOT_EXIST("LBMSVAL0002","A member with the user id does not exist"),
    INVALID_MEMBER_TO_UPDATE("LBMSVAL0003","A member with the requested user ID doesn't exist to update"),
    EMAIL_CANNOT_BE_UPDATED("LBMSVAL0004","Email address cannot be changed for a already registered user"),
    CATEGORY_EXISTS("LBMSVALCAT0001","Category already exists"),
    CATEGORY_WITH_ID_DOES_NOT_EXIST("LBMSVALCAT0002", "Requested category Id does not exist.");

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
