package com.crud.springBoot.repository;

import com.crud.springBoot.model.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {
}
