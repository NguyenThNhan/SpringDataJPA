package com.example.springdatajpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}
