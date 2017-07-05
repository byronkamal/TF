package Turma;
import java.util.Scanner;

import Disciplina.Disciplina;
import Professor.Professor;

public class Turma {
	Scanner s;
	Disciplina d;
	Professor p;
	
	private int codigo;
	private String horario;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo() {
		s = new Scanner(System.in);
		int codigo2 = s.nextInt();
		this.codigo = codigo2;
	}
	
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario() {
		s = new Scanner(System.in);
		String horario2 = s.nextLine();
		this.horario = horario2;
	}
	
}