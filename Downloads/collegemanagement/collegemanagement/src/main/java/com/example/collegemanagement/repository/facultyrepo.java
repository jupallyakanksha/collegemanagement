package com.example.collegemanagement.repository;

import com.example.collegemanagement.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface facultyrepo extends JpaRepository<Faculty, Long> {
    List<Faculty> findByDepartmentName(String departmentName);
    List<Faculty> findByDepartmentNameAndHodIsNotNull(String departmentName);
}