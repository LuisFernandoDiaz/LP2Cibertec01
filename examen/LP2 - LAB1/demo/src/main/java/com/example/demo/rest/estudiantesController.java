package com.example.demo.rest;


import com.example.demo.model.Estudiantes;
import com.example.demo.services.IEstudiantesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class estudiantesController {

    IEstudiantesServices estudiantesServices;

    @Autowired
    public estudiantesController(IEstudiantesServices estudiantesServices){
        this.estudiantesServices=estudiantesServices;
    }

    @GetMapping("/estudiantess")
    public List<Estudiantes> getAll(){
        return estudiantesServices.GetAllEstudiantess();
    }

    @PostMapping("/estudiantess")
    public Estudiantes saveEstudiantes(@RequestBody Estudiantes entity){
        return estudiantesServices.SaveEstudiantes(entity);
    }

    @GetMapping("/estudiantess/{id}")
    public Estudiantes getAll(@PathVariable int id){
        return estudiantesServices.FindEstudiantesById(id);
    }

    @PutMapping("/estudiantess")
    public Estudiantes updateEstudiantes(@RequestBody Estudiantes entity){
        return estudiantesServices.UpdateEstudiantes(entity);
    }



    @DeleteMapping("/estudiantess/{id}")
    public void DeleteEstudiantes(@PathVariable Integer id){
        estudiantesServices.DeleteEstudiantes(id);
    }

}
