package com.escola.senai.Controller;

import com.escola.senai.Model.Escola;
import com.escola.senai.Service.EscolaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class EscolaController {

    private final EscolaService service;

    public EscolaController(EscolaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Escola> buscarEscola() {
        return service.listaTodos();
    }

    @PostMapping
    public Escola salvarNovoEscola(@RequestBody Escola escola) {
        return service.salvar(escola);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Escola> buscarEscolaId(@PathVariable Long id) {
        Escola escola = service.buscarPorId(id);
        if (escola == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(escola);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEscola(@PathVariable Long id) {
        Escola escola = service.buscarPorId(id);
        if (escola == null) {
            return ResponseEntity.notFound().build();
        }
        service.excluirEscola(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Escola> atualizaEscola(@PathVariable Long id, @RequestBody Escola escolaAtualizado) {
        Escola existeEscola = service.buscarPorId(id);

        if (existeEscola == null) {
            return ResponseEntity.notFound().build();
        }

        existeEscola.setNome(escolaAtualizado.getNome());
        existeEscola.setEmail(escolaAtualizado.getEmail());
        existeEscola.setTelefone(escolaAtualizado.getTelefone());

        Escola atualizado = service.salvar(existeEscola);
        return ResponseEntity.ok(atualizado);
    }
}
