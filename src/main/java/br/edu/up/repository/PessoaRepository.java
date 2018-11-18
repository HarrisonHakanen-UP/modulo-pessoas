package br.edu.up.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.up.dominio.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{

}
