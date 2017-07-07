package Professor;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exceção.InformacaoFaltanteException;

public class Adjunto extends Assistente{

	Scanner s;
	
	private String doutorado;
	private String anoDoutorado;
	private String tituloTese;
	
	public String getDoutorado() {
		return doutorado;
	}
	public void setDoutorado() {
		System.out.println("\nDigite doutorado:");
		s = new Scanner(System.in);
		String doutorado2 = s.nextLine();
		this.doutorado = doutorado2;
		
		try {
			if(getDoutorado().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Doutorado", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getAnoDoutorado() {
		return anoDoutorado;
	}
	public void setAnoDoutorado() {
		System.out.println("\nDigite ano doutorado:");
		s = new Scanner(System.in);
		String anoDoutorado2 = s.nextLine();
		this.anoDoutorado = anoDoutorado2;
		
		try {
			if(getAnoDoutorado().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Ano Doutorado", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public String getTituloTese() {
		return tituloTese;
	}
	public void setTituloTese() {
		s = new Scanner(System.in);
		String tituloTese2 = s.nextLine();
		this.tituloTese = tituloTese2;
		
		try {
			if(getTituloTese().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Titulo Tese", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
}