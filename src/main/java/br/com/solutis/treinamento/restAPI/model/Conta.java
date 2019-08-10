package br.com.solutis.treinamento.restAPI.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.solutis.treinamento.restAPI.model.enums.CicloEnum;
import br.com.solutis.treinamento.restAPI.model.enums.TipoEnum;

@Entity
@Table(name = "Conta")
public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
//	@Column(name = "descricao")
    private String descricao;

//	@Column(name = "valor")
    private Double valor;
	
//	@Column(name = "parcelas")
	private Double parcelas;
	
//	@Column(name = "tipo")
	private TipoEnum tipo;
	
//	@Column(name = "ciclo")
	private CicloEnum ciclo;
	
	private LocalDate dataPagamento;
	
//	LocalDate dataParcela = LocalDate.now();

		
	//Metodos
	
	public Double getValorTotal() {
		return valor * parcelas;
	}
	
	public Double getPago() {
		return this.valor;
	}
	
	public Double getRestanteApagar() {
		return getValorTotal() - getPago();
	}
	
	//Metodo Gerar pagamento permanente
	
//	public Double getValorComDesconto() {
//		return valor;
//	}
	
	//Metodos
	
	public Conta (){}

    public Conta(Long id) {
		super();
		this.id = id;
	}

	public Conta(Long id, String descricao, Double valor, Double parcelas, TipoEnum tipo, CicloEnum ciclo, LocalDate dataPagamento) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.parcelas = parcelas;
		this.tipo = tipo;
		this.ciclo = ciclo;
		this.dataPagamento = dataPagamento;
	}
	
	//Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getParcelas() {
		return parcelas;
	}

	public void setParcelas(Double parcelas) {
		this.parcelas = parcelas;
	}
		
	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	public CicloEnum getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloEnum ciclo) {
		this.ciclo = ciclo;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
    
    
    
	
}
