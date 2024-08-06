package com.hexagon.school_service.controller;


import com.hexagon.school_service.model.SchoolModel;
import com.hexagon.school_service.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/school")
    public List<SchoolModel> getSchool(){
        return schoolService.getSchool();
    }
}
