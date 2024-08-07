package com.hexagon.school_service.controller;


import com.hexagon.school_service.model.SchoolModel;
import com.hexagon.school_service.service.SchoolServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/school")
@RestController
public class SchoolController {

    @Autowired
    private SchoolServiceImplement schoolService;

    @GetMapping
    public List<SchoolModel> getSchool(){
        return schoolService.getSchool();
    }

    @PostMapping
    public ResponseEntity<String> postSchool(@RequestBody SchoolModel school){
        return schoolService.postSchool(school);
    }
}
