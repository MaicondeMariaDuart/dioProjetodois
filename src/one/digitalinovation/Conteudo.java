package one.digitalinovation;

public abstract class Conteudo {
	
	public static final double XP_PADRAO = 10.0;
	
	private String titulo;
	private String descricao;
	
	protected abstract double calcularXp (); //metodo na classe pai que obrigam todos os filhos implementar
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

}
