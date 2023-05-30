package com.example.hw21.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDTO {


    private String teacher_id;
    private String area;
    private String street;
    private Integer buildingNumber;

}
