package com.example.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;

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
