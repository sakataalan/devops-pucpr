package com.example.pucpr.crudexample.service;

import com.example.pucpr.crudexample.entity.Empregado;
import com.example.pucpr.crudexample.repository.EmpregadoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmpregadoService {
    private final EmpregadoRepository empregadoRepository;

    public EmpregadoService(EmpregadoRepository empregadoRepository) {
        this.empregadoRepository = empregadoRepository;
    }

    public List<Empregado> create(Empregado empregado) {
        empregadoRepository.save(empregado);
        return list();
    }

    public List<Empregado> list() {
        return empregadoRepository.findAll();
    }

    public Empregado getEmpregado(String matricula) {
        return empregadoRepository.findEmpregadoByMatricula(matricula);
    }

    public List<Empregado> update(Empregado empregado, String matricula) {
        Empregado newEmpregado = empregadoRepository.findEmpregadoByMatricula(matricula);
        newEmpregado.setNome(empregado.getNome());
        newEmpregado.setAdmissao(empregado.getAdmissao());
        newEmpregado.setDesligamento(empregado.isDesligamento());
        newEmpregado.setMatricula(empregado.getMatricula());
        newEmpregado.setSalario(empregado.getSalario());
        empregadoRepository.save(newEmpregado);
        return list();
    }

    public List<Empregado> delete(String matricula) {
        empregadoRepository.deleteByMatricula(matricula);
        return list();
    }
}
