package com.example.hw21.Service;

import com.example.hw21.Model.ModelTeacher;
import com.example.hw21.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public  List<ModelTeacher> getAllTeacher(){
        return teacherRepository.findAll();
    }


    public void addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
    }

    public void updateTeacher(Teacher teacher,Integer id){
        Teacher oldTeacher= teacherRepository.findModelTeacherById(id);
        if(oldCustomer==null){
            throw new ApiException("Teacher not found");
        }

        oldTeacher.setName(teacher.getName());
        teacherRepository.save(oldTeacher);
    }


    public void deleteTeacher(Integer id){
        Teacher teacher= teacherRepository.findModelTeacherById(id);
        if(teacher==null){
            throw new ApiException("Teacher not found");
        }

        teacherRepository.delete(teacher);
    }
}

}
