package academy.appliedmath.gerenciadordetarefas.gerenciadordetarefas.modelo;

public class Tarefa {
	
	private long id;
	private String nome;
	private String autor;
	
	public Tarefa(long id, String nome, String autor) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
