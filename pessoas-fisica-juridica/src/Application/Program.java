package Application;

import model.Pessoa;
import model.PessoaFisica;

public class Program {

	public static void main(String[] args) {
		Pessoa p = new PessoaFisica("Paulo Henrique", 120000.00, 1000.00);
		System.out.println(p.calcularImpostos());

	}

}
