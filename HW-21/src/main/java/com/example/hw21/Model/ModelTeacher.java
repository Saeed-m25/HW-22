package com.example.hw21.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class ModelTeacher {
//    id , name , age , email , salary

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    private String name;
    @NonNull
    private Integer age;
    @NotEmpty
    private String email;
    private double salary;


    @OneToOne(cascade = CascadeType.ALL , mappedBy = "teacher")
    @PrimaryKeyJoinColumn
    private Address address;



    @OneToMany(cascade = CascadeType.ALL ,mappedBy ="teacher")
    private Set<ModelCourse> modelCourseSet;
}

