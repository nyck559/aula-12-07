package com.escola.senai.Controller;


import com.escola.senai.Model.Professor;
import com.escola.senai.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    private final ProfessorService services;

    public ProfessorController(ProfessorService services) {
        this.services = services;
    }

    @GetMapping
    public List<Professor> buscarAluno(){
        return services.listarTodos();
    }

    @PostMapping
    public Professor salvarNovoAluno(@RequestBody Professor aluno){
        Professor professor;
        return services.salvar(professor);
    }

    @GetMapping("/{id}")
    public Professor buscarProfessorId(@PathVariable Long id){
        return services.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable Long id){
        services.excluirProfessor(id);
    }


    @PutMapping("/{id}")
    public Professor atualizaProfessor(@PathVariable Long id, @RequestBody Professor ProfessorAtualizado){
        Professor existeProfessor = services.buscarPorId(id);

        if (existeProfessor == null) return null;
        existeProfessor.setNome(ProfessorAtualizado.getNome());
        existeProfessor.setEmail(ProfessorAtualizado.getEmail());
        existeProfessor.setTelefone(ProfessorAtualizado.getTelefone());

        return  services.salvar(existeProfessor);
    }

}
