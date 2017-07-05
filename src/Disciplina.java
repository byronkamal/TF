import java.util.*;

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	
	Disciplina() {
		int cg;
		Scanner s = new Scanner(System.in);
		cg = s.nextInt();
		
		this.cargaHoraria = cg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	
	
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
		
}