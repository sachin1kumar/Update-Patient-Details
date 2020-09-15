package com.example.demo.repositories;

import com.example.demo.model.PatientRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientRegistration, BigInteger> {
}
