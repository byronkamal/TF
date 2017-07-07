package Aluno;

import java.util.Scanner;

import javax.swing.*;

import Exceção.*;

public class Aluno {

	private String nome;
	private String matricula;
	private String semestreIngresso;
	

public String getNome () {
		
		return nome;
	}
	
	public void setNome () {
		String nome2;
		Scanner s = new Scanner(System.in);
		System.out.println("\nDigite o Nome da(o) Aluna(o): \n");
		nome2 = s.nextLine();
		
		this.nome = nome2;
		
		try {
			if(getNome().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Nome", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public void setMatricula() {
		
		String matricula2;
		Scanner s = new Scanner(System.in);
		System.out.println("\nDigite a Matricula da(o) Aluna(o): \n");
		matricula2 = s.nextLine();
		
		this.matricula = matricula2;
		
		try {
			if(getMatricula().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Matricula", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	
	public String getSemestreIngresso () {
		return semestreIngresso;
	}
	
	public void setSemestreIngresso() {
		String semestre2;
		Scanner s = new Scanner(System.in);
		System.out.println("\nDigite o Semestre de Ingresso na Universidade: \n");
		semestre2 = s.nextLine();
		this.semestreIngresso = semestre2;
	
		
		try {
			if(getSemestreIngresso().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "InformaÃ§Ã£o Faltante: Semestre de Ingresso", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
		
	System.out.println("\n");
	}
	
}