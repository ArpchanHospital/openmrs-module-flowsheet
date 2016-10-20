package org.openmrs.module.flowsheet.api.models;

import org.openmrs.module.flowsheet.api.Status;

public class Result {
    Status status;

    public Result(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
