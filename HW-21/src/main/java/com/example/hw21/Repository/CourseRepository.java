package com.example.hw21.Repository;

import java.util.List;

public interface CourseRepository {
    List<Course> findAll();

    Course findCourseById(Integer id);
}
