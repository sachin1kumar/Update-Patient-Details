package com.example.demo.model;

import java.math.BigInteger;

public class RegistrationResponse {

    private BigInteger patientId;

    public RegistrationResponse() {
    }

    public BigInteger getPatientId() {
        return patientId;
    }

    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

}
