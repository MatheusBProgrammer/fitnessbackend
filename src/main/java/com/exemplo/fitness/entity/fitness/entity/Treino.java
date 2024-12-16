package com.exemplo.fitness.entity.fitness.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "personais")
public class Treino {

    @Id
    private String id;
    private String personalId; // referência ao Personal
    private String alunoId;    // referência ao Aluno
    private List<String> rotinasIds; // lista de IDs de TreinoRotina

    public Treino() {
    }

    public Treino(String id, String personalId, String alunoId, List<String> rotinasIds) {
        this.id = id;
        this.personalId = personalId;
        this.alunoId = alunoId;
        this.rotinasIds = rotinasIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public List<String> getRotinasIds() {
        return rotinasIds;
    }

    public void setRotinasIds(List<String> rotinasIds) {
        this.rotinasIds = rotinasIds;
    }
}
