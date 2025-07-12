// package com.escola.senai.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// import com.escola.senai.Service.ProfessorService;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/professores")
// public class ProfessorController {

//     private final ProfessorService professorService;

//     @Autowired
//     public ProfessorController(ProfessorService professorService) {
//         this.professorService = professorService;
//     }

//     @GetMapping
//     public List<Professor> listarProfessores() {
//         return professorService.listarProfessores();
//     }

//     @GetMapping("/{id}")
//     public ResponseEntity<Professor> buscarPorId(@PathVariable Integer id) {
//         Optional<Professor> professor = professorService.buscarPorId(id);
//         return professor.map(ResponseEntity::ok)
//                         .orElseGet(() -> ResponseEntity.notFound().build());
//     }

//     @PostMapping
//     public ResponseEntity<?> criarProfessor(@RequestBody Professor professor) {
//         try {
//             Professor novoProfessor = professorService.adicionarProfessor(professor);
//             return ResponseEntity.ok(novoProfessor);
//         } catch (IllegalArgumentException e) {
//             return ResponseEntity.badRequest().body(e.getMessage());
//         }
//     }

//     @PutMapping("/{id}")
//     public ResponseEntity<?> atualizarProfessor(@PathVariable Integer id, @RequestBody Professor professor) {
//         try {
//             Professor atualizado = professorService.atualizarProfessor(id, professor);
//             return ResponseEntity.ok(atualizado);
//         } catch (IllegalArgumentException e) {
//             return ResponseEntity.badRequest().body(e.getMessage());
//         }
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<?> removerProfessor(@PathVariable Integer id) {
//         try {
//             professorService.removerProfessor(id);
//             return ResponseEntity.noContent().build();
//         } catch (IllegalArgumentException e) {
//             return ResponseEntity.notFound().build();
//         }
//     }
// }
