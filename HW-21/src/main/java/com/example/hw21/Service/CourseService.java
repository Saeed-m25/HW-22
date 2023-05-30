package com.example.hw21.Service;

import com.example.hw21.ApiExeception.ApiExeception;
import com.example.hw21.Controller.TeacherController;
import com.example.hw21.Model.ModelCourse;
import com.example.hw21.Model.ModelTeacher;
import com.example.hw21.Repository.CourseRepository;
import com.example.hw21.Repository.TeacherRepository;

import java.util.List;

public class CourseService {

    private final CourseRepository courseRepository;
    private final TeacherRepository teacherRepository;

    public  List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    public void updateCourse(Course course, Integer id) {
        Course oldCourse = courseRepository.findCourseById(id);
        if (oldCourse == null) {
            throw new ApiExeception("Course not found");
            oldCourse.setId(course.getId());
            oldCourse.setName(course.getName());

        }


        public void deleteCourse (Integer id){
            Course course = courseRepository.findCourseById(id);
            if (course == null) {
                throw new ApiExeception("Course not found");
            }

            courseRepository.delete(course);
        }


    }
    public void assignTeacherToCourse(Integer teacher_id,Integer course_Id){
        ModelTeacher modelTeacher=teacherRepository.findModelTeacherById(teacher_id);
        ModelCourse modelCourse=CourseRepository.findCourseById(course_Id);

        if (modelTeacher==null || modelCourse==null){
            throw new ApiExeception("id wrong , can't assign teacher to course");
        }
        modelCourse.setmodelCourse(modelCourse);

        courseRepository.save(modelCourse);
    }
}
