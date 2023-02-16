package com.crud.springBoot.service;

import com.crud.springBoot.model.Subject;
import com.crud.springBoot.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        List<Subject> subjectList=new ArrayList<>();
        subjectRepository.findAll().forEach(subjectList::add);
        return subjectList;
    }

    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    public void updateSubject(Subject subject, String id) {
        subjectRepository.save(subject);
    }

    public Optional<Subject> getSubjectById(String id) {
        return subjectRepository.findById(id);
    }

    public void deleteSubjectById(String id) {
        subjectRepository.deleteById(id);
    }
}
