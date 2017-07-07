package Aluno;
import java.util.Scanner;

import javax.swing.JOptionPane;
import Exceção.*;


public class Especial extends PosGraduação{
	
	private String taxaPaga;
	private String semestreCursado;
	
	public String getTaxaPaga() {
		return taxaPaga;
	}
	
	public void setTaxaPaga() {
		String taxa2;
		Scanner s = new Scanner(System.in);
		System.out.println("\nA taxa foi paga? \n");
		taxa2 = s.nextLine();
		this.taxaPaga = taxa2;
		
		try {
			if(getTaxaPaga().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Taxa Paga", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
		}
	
	
	
	public String getSemestreCursado() {
		return semestreCursado;
	}
	
	public void setSemestreCursado() {
		String semestre2;
		Scanner s = new Scanner(System.in);
		System.out.println("\nDigite o semestre cursado: \n");
		semestre2 = s.nextLine();
		this.semestreCursado = semestreCursado;
		
		try {
			if(getSemestreCursado().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
		}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Semestre Cursado", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}	
}