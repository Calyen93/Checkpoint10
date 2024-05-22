package com.example.checkpoint10.repository;

import com.example.checkpoint10.models.ExerciseSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseSubmissionRepository extends JpaRepository <ExerciseSubmission, Long> {

    List<ExerciseSubmission> findByStudentIdAndMarks(long studentId, short marks);

}
