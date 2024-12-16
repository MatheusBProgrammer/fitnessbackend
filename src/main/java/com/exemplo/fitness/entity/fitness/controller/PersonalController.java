package com.exemplo.fitness.entity.fitness.controller;


import com.exemplo.fitness.entity.fitness.entity.Personal;
import com.exemplo.fitness.entity.fitness.service.PersonalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personais")
public class PersonalController {

    private final PersonalService service;

    public PersonalController(PersonalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Personal> listarTodos(){
        return this.service.listarTodos();
    };

    @GetMapping("/{id}")
    public Personal buscarPorId(String id){
        return this.service.buscarPorId(id);
    }

    @PostMapping
    public Personal salvar(@RequestBody Personal personal){
        return this.service.salvar(personal);
    }

    @PutMapping("/{id}")
    public Personal atualizar(@PathVariable String id, @RequestBody Personal personal){
        return this.service.atualizar(id,personal);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id){
        this.service.deletar(id);
    }
}