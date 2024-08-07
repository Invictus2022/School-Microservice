package com.hexagon.school_service.service;

import com.hexagon.school_service.model.SchoolModel;
import com.hexagon.school_service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService implements SchoolServiceImplement {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<SchoolModel> getSchool() {
        return schoolRepository.findAll();

    }

    public ResponseEntity<SchoolModel> getSchoolByID(int id){

            Optional<SchoolModel> school = schoolRepository.findById(id);
        if(school.isPresent()){
            return new ResponseEntity<>(schoolRepository.getById(id),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null , HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<String> postSchool(SchoolModel school) {
        try {
            schoolRepository.save(school);
            return new ResponseEntity<>("Data Successfully added", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to add data: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<String> deleteSchool(int id){
        if(schoolRepository.findById(id).isPresent()){
            schoolRepository.deleteById(id);
            return new  ResponseEntity<>("Data Successfully deleted",HttpStatus.OK);
        }else{
            return new  ResponseEntity<>("Data Not Found",HttpStatus.BAD_REQUEST);
        }
    }
}