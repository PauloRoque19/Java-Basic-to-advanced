package org.cursoteste.primeiroteste;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CadastroPessoasTest {

	@Test
	public void deveCriarCadastroDePessoas() {
		CadastroPessoas cadastro = new CadastroPessoas();
		
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
	}
	
	@Test
	public void deveAdicionarUmaPessoa() {
		CadastroPessoas cadastro = new CadastroPessoas();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("José");
		cadastro.adicionar(pessoa);
		Assertions.assertThat(cadastro.getPessoas())
			.isNotEmpty()
			.hasSize(1);
	}
	
	@Test(expected = PessoaSemNotException.class)
	public void naoDeveAdicionarPessoaComNomeVazio() {
		CadastroPessoas cadastro = new CadastroPessoas();
		Pessoa pessoa = new Pessoa();
		
		cadastro.adicionar(pessoa);
	}
	
	@Test
	public void deveRemoverUmaPessoa() {
		CadastroPessoas cadastro = new CadastroPessoas();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Wilson");
		cadastro.adicionar(pessoa);
		
		cadastro.remover(pessoa);
		
		Assertions.assertThat(cadastro.getPessoas()).isEmpty();
	}
	
	@Test(expected = CadastroVazioException.class)
	public void deveLancarerroAoTentarRemoverPessoaInexistente() {
		CadastroPessoas cadastro = new CadastroPessoas();
		Pessoa pessoa = new Pessoa();
		cadastro.remover(pessoa);
	}
}
