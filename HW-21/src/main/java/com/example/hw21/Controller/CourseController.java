package com.example.hw21.Controller;

import com.example.hw21.ApiResponse.ApiResponse;
import com.example.hw21.Service.CourseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/course")
@RequiredArgsConstructor
public class CourseController {


    private final CourseService courseService;


    @GetMapping("/get")
    public ResponseEntity getAllCourse(){
        List<Course> courseList=courseService.getAllCourse();
        return ResponseEntity.status(200).body(courseList);
    }


    @PostMapping("/add")
    public ResponseEntity addCourse(@Valid @RequestBody Course course){
        courseService.addCourse(course);
        return ResponseEntity.status(200).body(new ApiResponse("Course added"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateCourse(@Valid @RequestBody Course course, @PathVariable Integer id){
        courseService.updateCourse(course,id);
        return ResponseEntity.status(200).body("Course Updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCourse(@PathVariable Integer id){
        courseService.deleteCourse(id);
        return ResponseEntity.status(200).body("Course deleted");



    }
}
