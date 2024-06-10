package com.example.demo.repository;

import com.example.demo.model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudiantesRepository extends JpaRepository<Estudiantes, Integer> {
}
