package model;

public class PessoaFisica extends Pessoa{

	private Double gastosComSaude;
	
	public PessoaFisica() {}
	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}



	@Override
	public double calcularImpostos() {
		if(rendaAnual < 20000.00 && this.gastosComSaude == null) {
			return rendaAnual * 0.15;
		}else if(rendaAnual < 20000.00 && this.gastosComSaude != null){
			return (rendaAnual * 0.15) - (this.gastosComSaude * 0.50);
		}
		else if( rendaAnual > 20000.00 && this.gastosComSaude != null){
			return (rendaAnual * 0.25) - (this.gastosComSaude * 0.50);
		}
		else {
			return rendaAnual * 0.25;
		}
	}

}
