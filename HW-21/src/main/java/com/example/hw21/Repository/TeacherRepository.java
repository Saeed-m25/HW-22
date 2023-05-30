package com.example.hw21.Repository;

import com.example.hw21.Model.ModelTeacher;
import com.example.hw21.Service.TeacherService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<ModelTeacher, Integer> {
    ModelTeacher findModelTeacherById(Integer id);
}
