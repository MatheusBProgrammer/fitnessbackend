package com.exemplo.fitness.entity.fitness.controller;

import com.exemplo.fitness.entity.fitness.entity.Exercicio;
import com.exemplo.fitness.entity.fitness.service.ExercicioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exercicios")
public class ExercicioController {

    private final ExercicioService service;

    public ExercicioController(ExercicioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Exercicio> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Exercicio buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Exercicio salvar(@RequestBody Exercicio exercicio) {
        return service.salvar(exercicio);
    }

    @PutMapping("/{id}")
    public Exercicio atualizar(@PathVariable String id, @RequestBody Exercicio exercicioAtualizado) {
        return service.atualizar(id, exercicioAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}
