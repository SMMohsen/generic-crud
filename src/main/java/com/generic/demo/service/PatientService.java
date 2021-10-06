package com.generic.demo.service;

import com.generic.demo.crud.DAOServiceImpl;
import com.generic.demo.entity.Patient;
import com.generic.demo.repostiory.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService extends DAOServiceImpl<Patient, PatientRepository> {

    public PatientService(PatientRepository patientRepository){
        super(patientRepository);
    }
}
