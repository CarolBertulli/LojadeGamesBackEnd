package org.generation.lojadegames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é Obrigátorio!")
	@Size(min = 10, max = 100, message ="O atributo nome deve conter no mínimo 100 e no máximo 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é Obrigátorio!")
	@Size(min = 10, max = 100, message ="O atributo descrição deve conter no mínimo 100 e no máximo 100 caracteres")
	private String descricao;

	@NotBlank(message = "O atributo tipo é Obrigátorio!")
	@Size(min = 10, max = 100, message ="O atributo tipo deve conter no mínimo 100 e no máximo 100 caracteres")
	private String tipo;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}