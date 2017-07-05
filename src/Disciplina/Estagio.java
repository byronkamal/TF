package Disciplina;
import Professor.Professor;

public class Estagio extends Disciplina{

	Professor p;
	
	private String localEstagio;
	private String responsavel;
	
	public String getLocalEstagio() {
		return localEstagio;
	}
	
	public void setLocaEstagio(String localEstagio) {
		this.localEstagio = localEstagio;
	}
	
	
	public String getResponsavel() {
		return responsavel;
	
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
}