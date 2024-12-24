package com.example.demoforJpa.repo;

import com.example.demoforJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
