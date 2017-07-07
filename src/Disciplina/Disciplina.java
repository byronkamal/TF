package Disciplina;
import java.util.*;

import javax.swing.JOptionPane;

import Exceção.*;

public class Disciplina {

	Scanner s;
	private String nome;
	private String cargaHoraria;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		System.out.println("\nDigite nome disciplina:");
		s = new Scanner(System.in);
		String nome2 = s.nextLine();
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
	public String getCargaHoraria() {
		return cargaHoraria;
	
	}
	public void setCargaHoraria() {
		System.out.println("\nDigite Darga Horaria da Disciplina:");
		s = new Scanner(System.in);
		String cargaHoraria2 = s.nextLine();
		this.cargaHoraria = cargaHoraria2;
		
		try {
			if(getCargaHoraria().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Carga Horaria", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}

		
}