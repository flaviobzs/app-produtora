package app.resources.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genero {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGenero;
	private String nome;
	private String descricao;
	
	public Genero() {
		
	}	
	
	public Genero(Long idGenero, String nome, String descricao) {
		super();
		this.idGenero = idGenero;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Long getIdGenero() {
		return idGenero;
	}
	
	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
