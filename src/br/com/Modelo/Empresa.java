package br.com.Modelo;

import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String nome;
	private Date dataAbertura= new Date();
	
	
//	public Empresa (String nome) {
//		
//		this.nome=nome;
//	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setData(Date data) {
		this.dataAbertura= data;
	}
	
	public Date getData(){
		return dataAbertura;
	}
	
	@Override
	public String toString() {
		return "Empresa: "+this.nome+ "/ Data de abertura: " + dataAbertura;
		
	}
	
	

}
