package br.edu.up.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.dominio.Pessoa;
import br.edu.up.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	PessoaRepository pessoaRepository;

	@GetMapping
	public @ResponseBody Iterable<Pessoa> listarPessoas() {
		Iterable<Pessoa> listaPessoas = pessoaRepository.findAll();
		return listaPessoas;
	}

	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Optional<Pessoa>> listarPessoa(@PathVariable int id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);

		if (pessoa == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(pessoa);
	}

	@PostMapping
	public void cadastrar(@RequestBody Pessoa pessoa) {
		pessoaRepository.save(pessoa);
		System.out.println("Pessoa cadastrada com sucesso!");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Pessoa> remover(@PathVariable int id) {
		Pessoa pessoa = pessoaRepository.findById(id).get();

		if (pessoa == null) {
			return ResponseEntity.notFound().build();
		}

		pessoaRepository.delete(pessoa);
		System.out.println("Pessoa removida com sucesso!");

		return ResponseEntity.noContent().build();
	}

}
