package com.example.hw21.Controller;

import com.example.hw21.ApiResponse.ApiResponse;
import com.example.hw21.Service.TeacherService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/teacher")
@RequiredArgsConstructor
@Service
public class TeacherController {

    private final TeacherService teacherService;
    @GetMapping("/get")
    public ResponseEntity getAllTeacher(){
        List<TeacherController> teacherList=teacherService.getAllTeacher();
        return ResponseEntity.status(200).body(teacherList);
    }



    @PostMapping("/add")
    public ResponseEntity addTeacher(@Valid @RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
        return ResponseEntity.status(200).body(new ApiResponse("teacher added");
    }


    @PutMapping("/update/{id}")
    public ResponseEntity updateTeacher(@Valid @RequestBody Teacher teacher, @PathVariable Integer id){
        teacherService.updateTeacher(teacher,id);
        return ResponseEntity.status(200).body("Teacher Updated");
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTeacher(@PathVariable Integer id){
        teacherService.deleteTeacher(id);
        return ResponseEntity.status(200).body("Teacher deleted");

    }


}
