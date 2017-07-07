package Turma;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Disciplina.Disciplina;
import Exceção.*;
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
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Codigo", "Erro", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
			} 
			
				this.codigo = codigo2;	
				
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
			JOptionPane.showMessageDialog(null, "Informacao Faltante: Horario", "Erro", JOptionPane.ERROR_MESSAGE);
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
				JOptionPane.showMessageDialog(null, "Professor(a) nao atribuido(a)\n Falta matricula Siape e/ou FUB", "Erro", JOptionPane.ERROR_MESSAGE);
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
				JOptionPane.showMessageDialog(null, "Disciplina nao atribuida\n Falta nome da disciplina", "Erro", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
		}
	}
	
}