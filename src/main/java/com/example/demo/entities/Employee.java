package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


    @Entity
    @Table(name = "employees")
    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Long id;

        private String firstname;
        private String lastname;
        private String email;
        private String phone;
        private String address;
        private Double salary;

    }


