package com.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Student")
public class StudentBean {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int stud_id;
    String studentName;
    int age;
    String course;
}
