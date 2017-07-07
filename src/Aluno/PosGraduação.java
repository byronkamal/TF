package Aluno;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Exceção.*;
import Professor.Professor;

public class PosGraduação extends Aluno {

	Scanner s;
	private String semestreQualificacao;
	private Date dataDefesa;
	public Professor p;
	
	
	public String getSemestreQualificacao() {
		return semestreQualificacao;
	}
	public void setSemestreQualificacao() {
		s = new Scanner(System.in);
		System.out.println("Digite o Semestre de Qualificacao: \n");
		String semestreQualificacao2 = s.nextLine();
		
		this.semestreQualificacao = semestreQualificacao2;
		
		try {
			if(getSemestreQualificacao().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null,"InformaÃ§Ã£o Faltante: Semestre Qualificacao", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
	}
	
	public Date getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("\nDigite a Data da Defesa: ");
			System.out.println("Ex: dd/mm/aaaa\n");
			String recebeData = s.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
				Date dt = df.parse(recebeData);	
				this.dataDefesa = dt;
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null, "InformaÃ§Ã£o Faltante: Data da Defesa", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
	}
	
	public void OrientadorProfessor(Professor pro) {
		this.p = pro;
		if (p.getMatriculaSiape().isEmpty() || p.getMatriculaFUB().isEmpty() ) {
			try {
				throw new OrientadorNaoAtribuidoException("\n");
			}
			catch (OrientadorNaoAtribuidoException e){
				JOptionPane.showMessageDialog(null, "Informacao Faltante: Professor nao atribuida", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}

}
