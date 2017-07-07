package Professor;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exceção.InformacaoFaltanteException;

public class Auxiliar extends Professor{
	Scanner s;
	
	private String graduacao;
	private String anoGraduacao;
	
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao() {
		System.out.println("\nDigite graduacao professor:");
		s = new Scanner(System.in);
		String graduacao2 = s.nextLine();
		this.graduacao = graduacao2;
		
		try {
			if(getGraduacao().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Graduacao", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	
	}
	public String getAnoGraduacao() {
		return anoGraduacao;
	}
	public void setAnoGraduacao() {
		System.out.println("\nDigite ano graduacao do professor:");
		s = new Scanner(System.in);
		String anoGraduacao2 = s.nextLine();
		this.anoGraduacao = anoGraduacao2;
		
		try {
			if(getAnoGraduacao().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Ano Graduacao", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
}