package com.example.firstsprintbootproject.controller;

import com.example.firstsprintbootproject.Course;
import com.example.firstsprintbootproject.Topic;
import com.example.firstsprintbootproject.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> courseList(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void storeTopic(@PathVariable String topicId, @RequestBody Course course){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @DeleteMapping("/topics/{courseId}/courses/{id}")
    public void deleteTopic(@PathVariable String id){
        courseService.deleteCourse(id);
    }

}
