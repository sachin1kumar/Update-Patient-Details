package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity(name = "patient_details")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class PatientRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger patient_id;
    private BigInteger doctor_id;
    private String patient_name;
    private String patient_address;
    private String email_id;
    private String password;

    public PatientRegistration() {

    }

    public BigInteger getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(BigInteger patient_id) {
        this.patient_id = patient_id;
    }

    public BigInteger getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(BigInteger doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
