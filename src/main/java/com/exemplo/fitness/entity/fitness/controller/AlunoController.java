package com.exemplo.fitness.entity.fitness.controller;

import com.exemplo.fitness.entity.fitness.entity.Aluno;
import com.exemplo.fitness.entity.fitness.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return service.salvar(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable String id, @RequestBody Aluno alunoAtualizado) {
        return service.atualizar(id, alunoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}
