package com.example.hw21.Model;

import com.example.hw21.Controller.TeacherController;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ModelAddress {
//    area , street , buildingNumber
    @Column
    private String area;
    @Column
    private String street;
    @Column
    private Integer buildingNumber;


    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;
}

