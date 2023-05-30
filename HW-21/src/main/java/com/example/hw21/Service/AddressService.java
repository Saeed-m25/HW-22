package com.example.hw21.Service;

import com.example.hw21.Model.ModelTeacher;
import com.example.hw21.Repository.AddressRepositori;
import com.example.hw21.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepositori addressRepositori;

    private final TeacherRepository teacherRepository;
    public void  AddDetails(TeacherDetailsDTO dto){
        Teacher teacher=teacherRepository.findModelTeacherById(dto.getTeacher_id());

        if (teacher==null){
            throw new ApiException("cin't add details, Teacher not found");
        }
        TeacherDetails TeacherDetails=new TeacherDetails( null,dto.getarea(),dto.getstreet(),dto.getbuildingNumber(),teacher)
        teacherDetailsRepository.save(TeacherDetails);
    }

}

}
