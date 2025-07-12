// package com.escola.senai.Service;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.Optional;

// @Service
// public class ProfessorService {

//     private final ProfessorInterface professorRepository;

//     @Autowired
//     public ProfessorService(ProfessorInterface professorRepository) {
//         this.professorRepository = professorRepository;
//     }

//     public List<Professor> listarProfessores() {
//         return professorRepository.findAll();
//     }

//     public Optional<Professor> buscarPorId(Integer id) {
//         return professorRepository.findById(id);
//     }

//     public Professor adicionarProfessor(Professor professor) {
//         validar(professor);
//         return professorRepository.save(professor);
//     }

//     public Professor atualizarProfessor(Integer id, Professor professorAtualizado) {
//         Optional<Professor> optProfessor = professorRepository.findById(id);
//         if (optProfessor.isEmpty()) {
//             throw new IllegalArgumentException("Professor não encontrado.");
//         }
//         validar(professorAtualizado);
//         Professor professor = optProfessor.get();

//         professor.setNome(professorAtualizado.getNome());
//         professor.setDisciplina(professorAtualizado.getDisciplina());
//         professor.setEmail(professorAtualizado.getEmail());
//         professor.setTelefone(professorAtualizado.getTelefone());

//         return professorRepository.save(professor);
//     }

//     public void removerProfessor(Integer id) {
//         if (!professorRepository.existsById(id)) {
//             throw new IllegalArgumentException("Professor não encontrado.");
//         }
//         professorRepository.deleteById(id);
//     }

//     private void validar(Professor professor) {
//         if (professor.getNome() == null || professor.getNome().trim().isEmpty()) {
//             throw new IllegalArgumentException("Nome é obrigatório.");
//         }
//         if (professor.getDisciplina() == null || professor.getDisciplina().trim().isEmpty()) {
//             throw new IllegalArgumentException("Disciplina é obrigatória.");
//         }
//         if (professor.getEmail() == null || !professor.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) {
//             throw new IllegalArgumentException("Email inválido.");
//         }
//         if (professor.getTelefone() == null || professor.getTelefone().trim().isEmpty()) {
//             throw new IllegalArgumentException("Telefone é obrigatório.");
//         }
//     }
// }
