package org.cursoteste.primeiroteste;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class PrimeiroTeste {

	@Test
	public void deveSomarDoisNumeros() {
		//cenário
		int numero1 = 10 , numero2 = 5;
		
		//execução
		int resultado = new Calculadora().soma(numero1, numero2);
		
		//verificação
		Assertions.assertThat(resultado).isBetween(14, 16);
		Assertions.assertThat(resultado).isEqualTo(15);
		Assertions.assertThat(resultado).isNotEqualTo(10);	
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveSomarNumerosNegativos() {
		Calculadora calc = new Calculadora();
		calc.soma(10, -5);
		calc = null;
	}
	
	@Test
	public void deveSubtrairDoisNumeros() {
		Calculadora calc = new Calculadora();
		int result = calc.subtracao(5, 2);
		Assertions.assertThat(result).isEqualTo(3);
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveSubtrairDoisNumeros() {
		Calculadora calc = new Calculadora();
		calc.subtracao(-1, 5);
	}
	
	@Test
	public void deveMultiplicarDoisNumeros() {
		Calculadora calc = new Calculadora();
		int result = calc.multiplicacao(5, 2);
		Assertions.assertThat(result).isEqualTo(10);
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveMultiplicarDoisNumeros() {
		Calculadora calc = new Calculadora();
		calc.subtracao(-1, 5);
	}
	
	@Test
	public void deveDividirDoisNumeros() {
		Calculadora calc = new Calculadora();
		int result = calc.divisao(10, 2);
		Assertions.assertThat(result).isEqualTo(5);
	}
	
	@Test(expected = RuntimeException.class)
	public void naoDeveDividirDoisNumeros() {
		Calculadora calc = new Calculadora();
		calc.divisao(10, 0);
	}
	
}

class Calculadora {
	
	int soma(int n1 , int n2) throws RuntimeException {
		if(n1 < 0 || n2 < 0) {
			throw new RuntimeException("Não é permitido calculos com números negativos.");
		}
		return n1 + n2;
	}
	
	int subtracao(int n1, int n2) {
		if(n1 < 0 || n2 < 0) {
			throw new RuntimeException("Não é permitido calculos com números negativos.");
		}
		return n1 - n2;
	}
	
	int multiplicacao(int n1, int n2) {
		if(n1 < 0 || n2 < 0) {
			throw new RuntimeException("Não é permitido calculos com números negativos.");
		}
		return n1 * n2;
	}
	
	int divisao(int n1, int n2) throws RuntimeException {
		if(n1 == 0 || n1 < 0 || n2 == 0 || n2 < 0 ) {
			throw new RuntimeException("Não é permitido dividir número negativos ou por zero.");
		}
		return n1 / n2;
	}
}
