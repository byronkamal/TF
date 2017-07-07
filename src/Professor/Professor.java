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
		String matriculaSiape2;
		s = new Scanner(System.in);
		System.out.println("\nDigite matricula Siape");
		matriculaSiape2 = s.nextLine();
		this.matriculaSiape = matriculaSiape2;
		
		try {
			if(getMatriculaSiape().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Matricula Siape", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getMatriculaFUB() {
		return matriculaFUB;
	}
	public void setMatriculaFUB() {
		String matriculaFUB2;
		s = new Scanner(System.in);
		System.out.println("\nDigite matricula FUB:");
		matriculaFUB2 = s.next();
		this.matriculaFUB = matriculaFUB2;
		
		try {
			if(getMatriculaFUB().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Matricula FUB", "Erro", JOptionPane.ERROR_MESSAGE);
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
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Formacao", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getSalario() {
		return salario;
	}
	public void setSalario() {
		System.out.println("\nDigite salario professor:");
		s = new Scanner(System.in);
		String salario2 = s.nextLine();
		this.salario = salario2;
		
		try {
			if(getSalario().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Salario", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}

}