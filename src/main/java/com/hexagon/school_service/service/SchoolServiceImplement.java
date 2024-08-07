package com.hexagon.school_service.service;

import com.hexagon.school_service.model.SchoolModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SchoolServiceImplement {
    List<SchoolModel> getSchool();
    ResponseEntity<String> postSchool(SchoolModel school);
}
