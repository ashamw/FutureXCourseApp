package com.futurex.services.FutureXCourseApp;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity(name = "course")

@JsonIgnoreProperties({"hibernateLazyIntialize", "handler"})
public class Course {
    @Id
    @Column(name = "courseid")
    private BigInteger courseId;

    @Column(name = "coursename")
    private String courseName;

    @Column(name = "authorname")
    private String authorName;

    public Course() {

    }

    public Course(BigInteger courseId, String courseName, String authorName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
    }


    public BigInteger getCourseId() {
        return courseId;
    }

    public void setCourseId(BigInteger courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}
