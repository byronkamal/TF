package Professor;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exceção.InformacaoFaltanteException;

public class Professor {
	Scanner s;
	
	private String matriculaSiape;
	private String matriculaFUB;
	private String formacao;
	private String salario;
	
	public String getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape() {
		System.out.println("\nDigite matricula Siape");
		s = new Scanner(System.in);
		String matriculaSiape2 = s.nextLine();
		this.matriculaSiape = matriculaSiape2;
		
		try {
			if(getMatriculaSiape().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Matricula Siape", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getMatriculaFUB() {
		return matriculaFUB;
	}
	public void setMatriculaFUB() {
		System.out.println("\nDigite matricula FUB:");
		s = new Scanner(System.in);
		String matriuculaFUB2 = s.nextLine();
		this.matriculaFUB = matriculaFUB;
		
		try {
			if(getMatriculaFUB().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Matricula FUB", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao() {
		System.out.println("\nDigite formacao professor:");
		s = new Scanner(System.in);
		String formacao2 = s.nextLine();
		this.formacao = formacao2;
		
		try {
			if(getFormacao().isEmpty()) {
				throw new InformacaoFaltanteException("Informacao Faltante: Formacao\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getSalario() {
		return salario;
	}
	public void setSalario() {
		System.out.println("\nDigite salario professor:");
		s = new Scanner(System.in);
		String salario = s.nextLine();
		this.salario = salario;
		
		try {
			if(getSalario().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Salario", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}

}