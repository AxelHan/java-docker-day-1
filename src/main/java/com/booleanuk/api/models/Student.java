package com.booleanuk.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String dateOfBirth;

    @Column
    private String courseTitle;

    @Column
    private String startDateForCourse;

    @Column
    private int averageGrade;

    public Student(String firstName, String lastName, String dateOfBirth, String courseTitle, String startDateForCourse, int averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.courseTitle = courseTitle;
        this.startDateForCourse = startDateForCourse;
        this.averageGrade = averageGrade;
    }
}