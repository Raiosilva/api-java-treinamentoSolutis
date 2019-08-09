package br.com.solutis.treinamento.restAPI.model.enums;

public enum TipoEnum {
	
	PAGAR("Pagamento"),
	RECEBER("Receber");
	
	private String descricao;

	//Metodo
	private TipoEnum(String descricao) {
		this.descricao = descricao;
	}

	//Getter
	public String getDescricao() {
		return descricao;
	}
}
