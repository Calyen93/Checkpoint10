package com.example.checkpoint10.controller;

import com.example.checkpoint10.service.ExerciseSubmissionService;
import com.example.checkpoint10.models.ExerciseSubmission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/submission")
public class ExerciseSubmissionController {

    @Autowired
    private ExerciseSubmissionService exerciseSubmissionService;

    @PostMapping
    public ResponseEntity<ExerciseSubmission> insertExerciseSubmission(@RequestBody ExerciseSubmission exerciseSubmission) {

        try {
            ExerciseSubmission exerciseSubmission1 = exerciseSubmissionService.insertExerciseSubmission(exerciseSubmission);
            return ResponseEntity.ok(exerciseSubmission1);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping("/student/{studentId}/unassessed")
    public ResponseEntity<List<ExerciseSubmission>> getUnassessedSubmission(@RequestParam long studentId){
        List<ExerciseSubmission> submissions = exerciseSubmissionService.getUnassessedExerciseSubmissionByStudent(studentId);
        return ResponseEntity.ok(submissions);
    }

    @PatchMapping("/{submissionId}/marks")
    public ResponseEntity<ExerciseSubmission> updateMarks(@PathVariable long submissionId, @RequestParam short marks){
        ExerciseSubmission updatedSubmission = exerciseSubmissionService.updateMarks(submissionId, marks);
        return ResponseEntity.ok(updatedSubmission);
    }
}
