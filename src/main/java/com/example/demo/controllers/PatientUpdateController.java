package com.example.demo.controllers;

import com.example.demo.model.PatientRegistration;
import com.example.demo.repositories.PatientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/update-registration")
public class PatientUpdateController {

    @Autowired
    private PatientDetailsRepository patientDetailsRepository;

    @RequestMapping(value = "/patient/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateRegisteredPatient(@PathVariable BigInteger id, @RequestBody PatientRegistration patientRegistration) {
        PatientRegistration patientDetails= patientDetailsRepository.findById(id).get();
        patientDetails.setDoctor_id(patientRegistration.getDoctor_id());
        patientDetails.setPatient_address(patientRegistration.getPatient_address());
        patientDetails.setPatient_name(patientRegistration.getPatient_name());
        patientDetails.setEmail_id(patientRegistration.getEmail_id());
        patientDetails.setPassword(patientRegistration.getPassword());
        patientDetailsRepository.save(patientDetails);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
