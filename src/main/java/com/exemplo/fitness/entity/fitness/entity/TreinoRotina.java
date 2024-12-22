package com.exemplo.fitness.entity.fitness.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "treino_rotinas")
public class TreinoRotina {

    @Id
    private String id;
    private String treinoId;
    private String exercicioId;

    private Integer repeticoes;
    private Integer series;
    private Double carga;
    private Integer descanso;
    private Integer ordem;

    public TreinoRotina() {
    }

    public TreinoRotina(String id, String treinoId, String exercicioId, Integer repeticoes, Integer series, Double carga, Integer descanso, Integer ordem) {
        this.id = id;
        this.treinoId = treinoId;
        this.exercicioId = exercicioId;
        this.repeticoes = repeticoes;
        this.series = series;
        this.carga = carga;
        this.descanso = descanso;
        this.ordem = ordem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTreinoId() {
        return treinoId;
    }

    public void setTreinoId(String treinoId) {
        this.treinoId = treinoId;
    }

    public String getExercicioId() {
        return exercicioId;
    }

    public void setExercicioId(String exercicioId) {
        this.exercicioId = exercicioId;
    }

    public Integer getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(Integer repeticoes) {
        this.repeticoes = repeticoes;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    public Integer getDescanso() {
        return descanso;
    }

    public void setDescanso(Integer descanso) {
        this.descanso = descanso;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }
}
