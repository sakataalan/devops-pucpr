package com.example.pucpr.crudexample.service;

import com.example.pucpr.crudexample.entity.Solicitacao;
import com.example.pucpr.crudexample.repository.SolicitacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SolicitacaoService {

    private final SolicitacaoRepository solicitacaoRepository;

    public SolicitacaoService(SolicitacaoRepository solicitacaoRepository) {
        this.solicitacaoRepository = solicitacaoRepository;
    }

    public List<Solicitacao> create(Solicitacao solicitacao) {
        solicitacaoRepository.save(solicitacao);
        return list();
    }

    public Solicitacao getById(Long id) {
        return solicitacaoRepository.findSolicitacaoById(id);
    }

    public List<Solicitacao> list() {
        return solicitacaoRepository.findAll();
    }

    public List<Solicitacao> update(Solicitacao solicitacao, Long id) {
        Solicitacao newSolicitacao = solicitacaoRepository.findSolicitacaoById(id);
        newSolicitacao.setSolicitacao(solicitacao.getSolicitacao());
        solicitacaoRepository.save(newSolicitacao);
        return list();
    }

    public List<Solicitacao> delete (Long id) {
        solicitacaoRepository.deleteById(id);
        return list();
    }
}
