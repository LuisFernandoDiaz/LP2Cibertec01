package com.example.demo.services;

import com.example.demo.model.Estudiantes;

import java.util.List;

public interface IEstudiantesServices {

    List<Estudiantes> GetAllEstudiantess();
    Estudiantes SaveEstudiantes(Estudiantes entity);
    Estudiantes FindEstudiantesById(int id);
    Estudiantes UpdateEstudiantes(Estudiantes entity);
    void DeleteEstudiantes(Integer id);


}
