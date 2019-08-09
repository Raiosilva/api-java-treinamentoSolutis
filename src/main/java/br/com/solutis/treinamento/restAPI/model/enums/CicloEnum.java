package br.com.solutis.treinamento.restAPI.model.enums;

public enum CicloEnum {
	
	PARCELADO("Parcelado"),
	PERMANENTE("Permanente");
	
	private String descricao;
	
	//Metodo
	private CicloEnum(String descricao) {
		this.descricao = descricao;
	}

	//Getters 
	public String getDescricao() {
		return descricao;
	}
}
