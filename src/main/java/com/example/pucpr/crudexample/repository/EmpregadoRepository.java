package com.example.pucpr.crudexample.repository;

import com.example.pucpr.crudexample.entity.Empregado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpregadoRepository extends JpaRepository<Empregado, Long> {

    public Empregado findEmpregadoByMatricula(String matricula);
    public void deleteByMatricula(String matricula);
}
