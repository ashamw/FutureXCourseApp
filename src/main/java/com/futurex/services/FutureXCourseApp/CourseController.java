package com.futurex.services.FutureXCourseApp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository repository;

    private Logger logger = LoggerFactory.getLogger(CourseController.class);

    @RequestMapping("/")
    public String mtd() {
        return "courseApp home";
    }

    @RequestMapping("/{id}")
    public Course getSpecificCourse(@PathVariable("id") BigInteger id) {
        Course course = repository.findById(id).get();
        if(Objects.nonNull(course)) {
            logger.info("Successfully fetched course");
        }
        return course;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteCourse(@PathVariable BigInteger id) {
        repository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/courses")
    public List<Course> getCourses() {
        List<Course> courses = repository.findAll();
        if(Objects.nonNull(courses) && courses.size()>0) logger.info("Successfully fetched all courses");
        return  courses;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void saveCourse(@RequestBody Course course) {
        repository.save(course);
    }

}
