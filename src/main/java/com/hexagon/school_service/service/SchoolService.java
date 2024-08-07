package com.hexagon.school_service.service;

import com.hexagon.school_service.model.SchoolModel;
import com.hexagon.school_service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService implements SchoolServiceImplement {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<SchoolModel> getSchool() {
        return schoolRepository.findAll();

    }

    public ResponseEntity<String> postSchool(SchoolModel school) {
        try {
            schoolRepository.save(school);
            return new ResponseEntity<>("Data Successfully added", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to add data: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}