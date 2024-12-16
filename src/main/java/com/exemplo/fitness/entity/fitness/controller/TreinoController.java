package com.exemplo.fitness.entity.fitness.controller;

import com.exemplo.fitness.entity.fitness.entity.Treino;
import com.exemplo.fitness.entity.fitness.service.TreinoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treinos")
public class TreinoController {

    private final TreinoService service;

    public TreinoController(TreinoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Treino> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Treino buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Treino salvar(@RequestBody Treino treino) {
        return service.salvar(treino);
    }

    @PutMapping("/{id}")
    public Treino atualizar(@PathVariable String id, @RequestBody Treino treinoAtualizado) {
        return service.atualizar(id, treinoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}
