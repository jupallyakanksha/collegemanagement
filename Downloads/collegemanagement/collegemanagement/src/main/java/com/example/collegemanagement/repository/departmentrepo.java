package com.example.collegemanagement.repository;


import com.example.collegemanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface departmentrepo extends JpaRepository<Department, Long> {
    List<Department> findByCollegeName(String collegeName);
}
