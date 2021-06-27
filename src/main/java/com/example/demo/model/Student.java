package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;

/**
 * @author : christiaan.griffioen
 * @since :  15-6-2021, di
 **/

@Data
@NoArgsConstructor
@Entity
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    @ApiModelProperty(notes="unique email on which you can search")
    private String email;

    @Transient
    private String interests;

    public Student(String firstName, String lastName, Gender gender, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }
}
