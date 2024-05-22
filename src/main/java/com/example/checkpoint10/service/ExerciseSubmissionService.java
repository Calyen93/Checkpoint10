package com.example.checkpoint10.service;

import com.example.checkpoint10.models.ExerciseSubmission;
import com.example.checkpoint10.repository.ExerciseSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciseSubmissionService {

    @Autowired
    private ExerciseSubmissionRepository exerciseSubmissionRepository;

    public ExerciseSubmission insertExerciseSubmission(ExerciseSubmission exerciseSubmission){
        if(exerciseSubmission.getMarks() < -1 && exerciseSubmission.getMarks() > 5  ){
            throw new IllegalArgumentException("");
        }
        return exerciseSubmissionRepository.save(exerciseSubmission);
    }

    public List<ExerciseSubmission> getUnassessedExerciseSubmissionByStudent(long studentId){
        return exerciseSubmissionRepository.findByStudentAndMarks(studentId, (short) -1);
    }

    public ExerciseSubmission updateMarks(Long submissionId, short marks)
    {
        ExerciseSubmission submission = exerciseSubmissionRepository.findById(submissionId)
                .orElseThrow(() -> new RuntimeException(""));

                if (marks < -1 || marks > 5) {
                   throw  new  IllegalArgumentException("");
                }

                submission.setMarks(marks);
                return exerciseSubmissionRepository.save(submission);
    }
}
