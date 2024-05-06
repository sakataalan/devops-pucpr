package com.example.pucpr.crudexample.controller;

import com.example.pucpr.crudexample.entity.Empregado;
import com.example.pucpr.crudexample.repository.EmpregadoRepository;
import com.example.pucpr.crudexample.service.EmpregadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empregado")
public class EmpregadoController {
    private EmpregadoService empregadoService;

    public EmpregadoController(EmpregadoService empregadoService) {
        this.empregadoService = empregadoService;
    }

    @PostMapping
    List<Empregado> create(@RequestBody Empregado empregado) {
        return empregadoService.create(empregado);
    }

    @GetMapping
    List<Empregado> list() {
        return empregadoService.list();
    }

    @GetMapping("/{matricula}")
    Empregado getEmpregadoByMatricula(@PathVariable String matricula) {
        return empregadoService.getEmpregado(matricula);
    }

    @PutMapping("/{matricula}")
    List<Empregado> update(@RequestBody Empregado empregado, @PathVariable String matricula) {
        return empregadoService.update(empregado, matricula);

    }

    @DeleteMapping("/{matricula}")
    List<Empregado> delete(@PathVariable String matricula) {
        return empregadoService.delete(matricula);
    }
}
