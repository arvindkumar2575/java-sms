package com.example.javasms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.javasms.entility.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
