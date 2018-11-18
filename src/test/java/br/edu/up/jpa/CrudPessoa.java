package br.edu.up.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.dominio.Pessoa;
import br.edu.up.repository.PessoaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudPessoa {

	@Autowired
	PessoaRepository pessoaRepository;

	/**
	 * Métodos Crud.
	 */

	@Test
	public void PessoaCrud() {

		// Salvar pessoa

		pessoaRepository.save(new Pessoa(1, "visualizarPrimeironome", "visualizarSegundoNome", "visualizarTitulo",
				"visualizarGenero", 321321, 321321, "visualizarCidade", "visualizarEstado", "visualizarPais",
				"visualizarEndereco", 321, 888, 99, 88889999, "visualizarEmail", "visualizarLogin", "visualizarSenha"));

		pessoaRepository.save(new Pessoa(1, "buscarPrimeironome", "buscarSegundoNome", "buscarTitulo", "buscarGenero",
				321321, 321321, "buscarCidade", "buscarEstado", "buscarPais", "buscarEndereco", 321, 888, 99, 88889999,
				"buscarEmail", "buscarLogin", "buscarSenha"));

		// busca pessoas
		System.out.println("\n*************Pessoas*************");
		pessoaRepository.findAll().forEach(System.out::println);

	}

}
