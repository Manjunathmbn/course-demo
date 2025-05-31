package com.course.demo.service;

import com.course.demo.model.Course;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CourseService {
    private final Map<String, Course> courseMap = new ConcurrentHashMap<>();

    public Course createCourse(Course course) {
        courseMap.put(course.getId(), course);
        return course;
    }

    public Course getCourse(String id) {
        return courseMap.get(id);
    }
}
