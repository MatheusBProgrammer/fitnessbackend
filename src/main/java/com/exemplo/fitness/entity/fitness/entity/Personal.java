package com.exemplo.fitness.entity.fitness.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "personais")
public class Personal {

    @Id
    private Long id;
    private String nome;
    private String hashPassword;
    private String fotoUrl;

    public Personal() {
    }

    public Personal(Long id, String nome, String hashPassword, String fotoUrl) {
        this.id = id;
        this.nome = nome;
        this.hashPassword = hashPassword;
        this.fotoUrl = fotoUrl;
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

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
}
