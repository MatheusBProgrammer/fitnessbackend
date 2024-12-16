package com.exemplo.fitness.entity.fitness.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "alunos")
public class Aluno {

    @Id
    private Long id;

    private String nome;
    private LocalDate dataInicio;
    private String dados; // informações do aluno (altura, peso, etc.)

    public Aluno() {
    }

    public Aluno(Long id, String nome, LocalDate dataInicio, String dados) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dados = dados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}
