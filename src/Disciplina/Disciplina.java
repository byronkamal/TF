package Disciplina;
import java.util.*;

public class Disciplina {

	Scanner s;
	private String nome;
	private int cargaHoraria;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		System.out.println("\nDigite nome disciplina:");
		s = new Scanner(System.in);
		String nome2 = s.nextLine();
		this.nome = nome2;
	
	
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	
	}
	public void setCargaHoraria() {
		System.out.println("\nDigite carga horaria disciplina:");
		s = new Scanner(System.in);
		int cargaHoraria2 = s.nextInt();
		this.cargaHoraria = cargaHoraria2;
	}

		
}