package com.patient.registration.Patient.registration.microservice.repositories;

import com.patient.registration.Patient.registration.microservice.model.PatientRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientRegistration, BigInteger> {
}
