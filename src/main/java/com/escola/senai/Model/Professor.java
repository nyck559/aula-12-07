// package com.escola.senai.Model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity
// @Table(name = "professores")
// public class Professor {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Integer id;

//     private String nome;
//     private String disciplina;
//     private String email;
//     private String telefone;

//     public Professor() {
//     }

//     public Professor(Integer id, String nome, String disciplina, String email, String telefone) {
//         this.id = id;
//         this.nome = nome;
//         this.disciplina = disciplina;
//         this.email = email;
//         this.telefone = telefone;
//     }

//     // Getters e setters
//     public Integer getId() { return id; }
//     public void setId(Integer id) { this.id = id; }

//     public String getNome() { return nome; }
//     public void setNome(String nome) { this.nome = nome; }

//     public String getDisciplina() { return disciplina; }
//     public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

//     public String getEmail() { return email; }
//     public void setEmail(String email) { this.email = email; }

//     public String getTelefone() { return telefone; }
//     public void setTelefone(String telefone) { this.telefone = telefone; }
// }
