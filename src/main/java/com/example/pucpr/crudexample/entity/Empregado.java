package com.example.pucpr.crudexample.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name =  "empregado")
public class Empregado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private String nome;
    private LocalDate admissao;
    private boolean desligamento;
    private int salario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAdmissao() {
        return admissao;
    }

    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao;
    }

    public boolean isDesligamento() {
        return desligamento;
    }

    public void setDesligamento(boolean desligamento) {
        this.desligamento = desligamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
