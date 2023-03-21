package com.lbms.library.core.util.constant;

public enum CategoryStatus {
    ACTIVE("Active"), INACTIVE("Inactive");

    private String status;

    private CategoryStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
