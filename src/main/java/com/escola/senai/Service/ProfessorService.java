package com.escola.senai.Service;

import com.escola.senai.Interface.ProfessorRepository;
import com.escola.senai.Model.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository repositorys;

    public ProfessorService(ProfessorRepository repository) {
        this.repositorys = repository;
    }

    public List<Professor> listarTodos(){
        return repositorys.findAll();
    }

    public Professor salvar(Professor professor){
        return repositorys.save(professor);
    }

    public void excluirProfessor(Long id){
        repositorys.deleteById(id);
    }

    public Professor buscarPorId(Long id){
        return repositorys.findById(id).orElse(null);
    }

}
