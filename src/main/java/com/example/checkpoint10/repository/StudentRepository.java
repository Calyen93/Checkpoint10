package com.example.checkpoint10.repository;

import com.example.checkpoint10.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Long>{
}
