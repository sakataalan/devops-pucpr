package com.example.pucpr.crudexample.repository;

import com.example.pucpr.crudexample.entity.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
    public Solicitacao findSolicitacaoById (Long id);
}
