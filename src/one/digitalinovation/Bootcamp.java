package one.digitalinovation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	
	private String nome;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	private List<Conteudo> conteudos= new ArrayList<>();
	private List<Dev> devs= new ArrayList<>();
	public String getNome() {
		return nome;
		
	
	}
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getFim() {
		return fim;
	}
	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(List<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	public List<Dev> getDevs() {
		return devs;
	}
	public void setDevs(List<Dev> devs) {
		this.devs = devs;
	}
	
	
	
	

}
