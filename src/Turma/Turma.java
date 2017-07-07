package Turma;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Disciplina.Disciplina;
import Exce��o.*;
import Professor.Professor;

public class Turma {
	Scanner s;
	public Disciplina d;
	public Professor p;
	
	private String codigo;
	private String horario;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo() throws InterruptedException {
		System.out.println("\nDigite o Codigo da Turma: \n");
		s = new Scanner(System.in);
		String codigo2 = s.nextLine();
		this.codigo = codigo2;
		
		if(getCodigo().isEmpty()){
			try {
			if(getCodigo().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Código", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
			
			while(getCodigo().isEmpty()){
			
			Thread.sleep(50);
			System.out.println("\nInsira Código novamente");
				
				codigo2 = s.nextLine();
				if(codigo2.isEmpty()){
				JOptionPane.showMessageDialog(null, "Informacao Faltante: Código", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				this.codigo = codigo2;
				
				
			}
		}
		
		
		
	}
	
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario() {
		System.out.println("\nDigite o Horario: \n");
		s = new Scanner(System.in);
		String horario2 = s.nextLine();
		this.horario = horario2;
		
		try {
			if(getHorario().isEmpty()) {
				throw new InformacaoFaltanteException("\n");
			}
				
			}
		catch(InformacaoFaltanteException e) {
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Horário", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
		
	}
	
	public void ProfessorFaltante(Professor pro) {
		this.p = pro;
		if (p.getMatriculaSiape().isEmpty() || p.getMatriculaFUB().isEmpty() ) {
			try {
				throw new ProfessorNaoAtribuidoException("\n");
			}
			catch (ProfessorNaoAtribuidoException e){
				JOptionPane.showMessageDialog(null, "Informacao Faltante: Professor nao atribuida", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}
	
	public void DisciplinaFaltante(Disciplina disc) {
		this.d = disc;
		if (d.getNome().isEmpty()) {
			try {
				throw new DisciplinaNaoAtribuidaException("\n");
			}
			catch (DisciplinaNaoAtribuidaException e){
				JOptionPane.showMessageDialog(null, "Informacao Faltante: Disciplina nao atribuida", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}
	
}