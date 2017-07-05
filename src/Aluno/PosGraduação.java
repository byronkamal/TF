package Aluno;
import java.util.Date;

import Professor.Professor;

public class PosGraduação extends Aluno{

	Professor p;
	
	private String semestreQualificacao;
	private Date dataDefesa;
	
	
	public String getSemestreQualificacao() {
		return semestreQualificacao;
	}
	public void setSemestreQualificacao(String semestreQualificacao) {
		this.semestreQualificacao = semestreQualificacao;
	}
	
	public Date getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa(Date dataDefesa) {
		this.dataDefesa = dataDefesa;
	}
	
}