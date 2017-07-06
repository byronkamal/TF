package Aluno;

import java.util.Scanner;

import javax.swing.*;

import Exceção.InformacaoFaltanteException;

public class Aluno {

	private String matricula;
	private String nome;
	private String semestreIngresso;
	

	public void setMatricula() {
		
		String matricula2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a Matricula da(o) Aluna(o): \n");
		matricula2 = s.nextLine();
		
		this.matricula = matricula2;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getNome () {
		
		return nome;
	}
	
	public void setNome () {
		String nome2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o Nome da(o) Aluna(o): \n");
		nome2 = s.nextLine();
		
		this.nome = nome2;
	}
	
	
	public String getSemestreIngresso () {
		return semestreIngresso;
	}
	
	public void setSemestreIngresso() {
		String semestre2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o Semestre de Ingresso na Universidade: \n");
		semestre2 = s.nextLine();
		this.semestreIngresso = semestre2;
	{
		
		try {
			if(getMatricula().isEmpty() ||getNome().isEmpty() || getSemestreIngresso().isEmpty()) {
				throw new InformacaoFaltanteException("\nFalta informacao!!");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			e.printStackTrace();
			}
		}
	System.out.println("\n");
	}
	
}