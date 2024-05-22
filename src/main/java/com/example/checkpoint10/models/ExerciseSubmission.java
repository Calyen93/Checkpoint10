package com.example.checkpoint10.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ExerciseSubmission {

    @Id
    @GeneratedValue
    private long submissionid;

    private String exerciseId;

    @ManyToOne
    private Student student;

    private short marks;

    public ExerciseSubmission(long submissionid, String exerciseId, Student student, short marks) {
        this.submissionid = submissionid;
        this.exerciseId = exerciseId;
        this.student = student;
        this.marks = marks;
    }

    public ExerciseSubmission() {
    }

    public long getSubmissionid() {
        return submissionid;
    }

    public void setSubmissionid(long submissionid) {
        this.submissionid = submissionid;
    }

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public short getMarks() {
        return marks;
    }

    public void setMarks(short marks) {
        this.marks = marks;
    }
}
