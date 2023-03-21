package com.lbms.library.core.util;

public enum CategoryConstant {
    ACTIVE("Active"), INACTIVE("Inactive");

    private String status;

    private CategoryConstant(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
