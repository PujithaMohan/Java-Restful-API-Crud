package com.crud.springBoot.controller;

import com.crud.springBoot.model.Subject;
import com.crud.springBoot.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping("/getAllSubjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @GetMapping("/getSubjectById/{id}")
    public Optional<Subject> getSubjectById(@PathVariable String id){
        return subjectService.getSubjectById(id);
    }

    @PostMapping("/addSubject")
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @PutMapping("/updateSubject/{id}")
    public void updateSubject(@RequestBody Subject subject, @PathVariable String id){
        subjectService.updateSubject(subject,id);
    }

    @DeleteMapping("/deleteSubjectById/{id}")
    public void deleteSubjectById(@PathVariable String id){
        subjectService.deleteSubjectById(id);
    }
}
