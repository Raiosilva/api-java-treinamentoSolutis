package br.com.solutis.treinamento.restAPI.model.enums;

public enum CicloEnum {
	
	PARCELADO("Parcelado"),
	PERMANENTE("Permanente");
	
	private String descricao;
	
	public String getDescricao() {
		return descricao;
	}

	private CicloEnum(String descricao) {
		this.descricao = descricao;
	}


}
