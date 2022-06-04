package com.monocept.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monocept.model.Student;
@Repository
public interface IstudentCRUDRepository extends CrudRepository<Student, Integer> {

}
