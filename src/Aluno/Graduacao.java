package Aluno;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exce��o.*;

public class Graduacao extends Aluno {

	private String formaIngresso;
	private String curso;
	private Date provavelFormatura;
	
	public String getFormaIngresso(){
		return formaIngresso;
	}
	
	public void setFormaIngresso(){
		String formaIngresso2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a Forma de Ingresso na Universidade: \n");
		formaIngresso2 = s.nextLine();
		this.formaIngresso = formaIngresso2;
		
		try {
			if(getFormaIngresso().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informação Faltante: Forma Ingresso", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso () {
		String curso2;
		Scanner s = new Scanner(System.in);
		System.out.println("\nDigite o Curso: \n");
		curso2 = s.nextLine();
		this.curso = curso2;
		
		try {
			if(getCurso().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informação Faltante: Curso", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	
	public Date getProvavelFormatura() {
		return provavelFormatura;
	}
	
	public void setProvavelFormatura() {
			
		try {
				Scanner s = new Scanner(System.in);
				System.out.println("\nDigite a Data de Provavel Formatura: ");
				System.out.println("Ex: dd/mm/aaaa\n");
				String formatura2 = s.nextLine();
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
					Date dt = df.parse(formatura2);	
					this.provavelFormatura = dt;
				} catch (ParseException e) {
					JOptionPane.showMessageDialog(null, "Informação Faltante: Data Provavel Formatura", "Erro", JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
		}

}
