package com.exemplo.fitness.entity.fitness.controller;

import com.exemplo.fitness.entity.fitness.entity.TreinoRotina;
import com.exemplo.fitness.entity.fitness.service.TreinoRotinaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/treino-rotinas")
public class TreinoRotinaController {

    private final TreinoRotinaService service;

    public TreinoRotinaController(TreinoRotinaService service) {
        this.service = service;
    }

    @GetMapping
    public List<TreinoRotina> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public TreinoRotina buscarPorId(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public TreinoRotina salvar(@RequestBody TreinoRotina rotina) {
        return service.salvar(rotina);
    }

    @PutMapping("/{id}")
    public TreinoRotina atualizar(@PathVariable String id, @RequestBody TreinoRotina rotinaAtualizada) {
        return service.atualizar(id, rotinaAtualizada);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}
