package com.example.demo.services.impl;


import com.example.demo.model.Estudiantes;
import com.example.demo.repository.IEstudiantesRepository;
import com.example.demo.services.IEstudiantesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesServices implements IEstudiantesServices {

    IEstudiantesRepository _estudiantesRepository;

    @Autowired
    public EstudiantesServices( IEstudiantesRepository estudiantesRepository){
        _estudiantesRepository = estudiantesRepository;
    }


    @Override
    public List<Estudiantes> GetAllEstudiantess() {
        return _estudiantesRepository.findAll();
    }

    @Override
    public Estudiantes SaveEstudiantes(Estudiantes entity) {
        Estudiantes estudiantesSaved = _estudiantesRepository.save(entity);
        return estudiantesSaved;
    }

    @Override
    public Estudiantes FindEstudiantesById(int id) {
        Optional<Estudiantes> rowInDB = _estudiantesRepository.findById(id);
        if (rowInDB.isPresent())
            return rowInDB.get();
        else
            return new Estudiantes();
    }

    @Override
    public Estudiantes UpdateEstudiantes(Estudiantes entity) {
        Estudiantes estudiantesUbdate = _estudiantesRepository.save(entity);
        return  estudiantesUbdate;
    }

    @Override
    public void DeleteEstudiantes(Integer id) {
        _estudiantesRepository.deleteById(id);
    }

}
