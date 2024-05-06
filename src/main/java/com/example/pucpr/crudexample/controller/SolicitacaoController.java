package com.example.pucpr.crudexample.controller;

import com.example.pucpr.crudexample.entity.Empregado;
import com.example.pucpr.crudexample.entity.Solicitacao;
import com.example.pucpr.crudexample.service.SolicitacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {

    private SolicitacaoService solicitacaoService;

    public SolicitacaoController(SolicitacaoService solicitacaoService) {
        this.solicitacaoService = solicitacaoService;
    }

    @GetMapping
    List<Solicitacao> list() {
        return solicitacaoService.list();
    }

    @GetMapping("/{id}")
    Solicitacao getSolicitacaoById(@PathVariable Long id) {
        return solicitacaoService.getById(id);
    }

    @PostMapping
    List<Solicitacao> create(@RequestBody Solicitacao solicitacao) {
        return solicitacaoService.create(solicitacao);
    }

    @PutMapping("/{id}")
    List<Solicitacao> update(@RequestBody Solicitacao solicitacao, @PathVariable Long id) {
        return solicitacaoService.update(solicitacao, id);
    }

    @DeleteMapping("/{id}")
    public List<Solicitacao> delete(@PathVariable Long id) {
        return solicitacaoService.delete(id);
    }
}
