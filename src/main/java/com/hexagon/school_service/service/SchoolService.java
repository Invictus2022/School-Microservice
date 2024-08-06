package com.hexagon.school_service.service;

import com.hexagon.school_service.model.SchoolModel;
import com.hexagon.school_service.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepository;

    public List<SchoolModel> getSchool() {
        return  schoolRepository.findAll();

    }
}
