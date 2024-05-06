package com.example.pucpr.crudexample.entity;

import jakarta.persistence.*;

@Entity
@Table(name =  "solicitacao")
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String solicitacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }
}
