package Disciplina;
import java.util.Scanner;

import Professor.Professor;

public class Estagio extends Disciplina{

	Scanner s;
	Professor p;
	
	private String localEstagio;
	private String responsavel;
	
	public String getLocalEstagio() {
		return localEstagio;
	}
	
	public void setLocaEstagio() {
		System.out.println("\nDigite local estagio:");
		s = new Scanner(System.in);
		String localEstagio2 = s.nextLine();
		this.localEstagio = localEstagio2;
	}
	
	
	public String getResponsavel() {
		return responsavel;
	
	}
	public void setResponsavel() {
		System.out.println("\nDigite professor responsavel:");
		s = new Scanner(System.in);
		String responsavel2 = s.nextLine();
		this.responsavel = responsavel;
	}
	
}