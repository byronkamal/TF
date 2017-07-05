package Disciplina;
import java.util.*;

public class Disciplina {

	private String nome;
	private int cargaHoraria;
	
	 Disciplina() {
		String nome;
		Scanner s = new Scanner(System.in);
		nome = s.nextLine();
		this.nome= nome;
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