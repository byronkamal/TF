package Professor;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exceção.InformacaoFaltanteException;

public class Associado extends Adjunto {

	Scanner s;
	
	private String areaPesquisa;
	
	public String getAreaPesquisa() {
		return areaPesquisa;
	}
	public void setAreaPesquisa(){
		s = new Scanner(System.in);
		String areaPesquisa2 = s.nextLine();
		this.areaPesquisa = areaPesquisa;
		
		try {
			if(getAreaPesquisa().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: ", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
}