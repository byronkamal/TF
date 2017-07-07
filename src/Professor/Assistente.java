package Professor;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exceção.InformacaoFaltanteException;

public class Assistente extends Auxiliar{
	
	Scanner s;
	
	private String mestrado;
	private String anoMestrado;
	private String tituloDissertacao;
	
	public String getMestrado() {
		return mestrado;
	}
	
	
	public void setMestrado() {
		System.out.println("\nDigite mestrado do professor:");
		s = new Scanner(System.in);
		String mestrado2 = s.nextLine();
		this.mestrado = mestrado2;
		
		try {
			if(getMestrado().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Mestrado", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getAnoMestrado() {
		return anoMestrado;
	}
	public void setAnoMestrado() {
		System.out.println("\nDigite ano mestrado:");
		s = new Scanner(System.in);
		String anoMestrado2 = s.nextLine();
		this.anoMestrado = anoMestrado2;
		
		try {
			if(getAnoMestrado().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Ano Mestrado", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getTituloDissertacao() {
		return tituloDissertacao;
	}
	public void setTituloDissertacao() {
		System.out.println("\nDigite titulo da dissertacao:");
		s = new Scanner(System.in);
		String tituloDissertacao2 = s.nextLine();
		this.tituloDissertacao = tituloDissertacao2;
		
		try {
			if(getTituloDissertacao().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Titulo Dissertacao", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
}