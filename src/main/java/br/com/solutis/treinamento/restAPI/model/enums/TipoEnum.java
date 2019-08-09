package br.com.solutis.treinamento.restAPI.model.enums;

public enum TipoEnum {
	
	PAGAR("Pagamento"),
	RECEBER("Receber");
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	private TipoEnum(String descricao) {
		this.descricao = descricao;
	}


}
