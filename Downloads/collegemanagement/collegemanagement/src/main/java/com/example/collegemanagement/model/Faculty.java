package com.example.collegemanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hod;

    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    // Constructors, getters, setters
}
