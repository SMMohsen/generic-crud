package com.generic.demo.controller;


import com.generic.demo.crud.DAOControllerImpl;
import com.generic.demo.entity.Patient;
import com.generic.demo.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController extends DAOControllerImpl<PatientService, Patient> {

    public PatientController(PatientService patientService) {
        super(patientService);
    }
}
