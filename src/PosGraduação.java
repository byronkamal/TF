import java.util.Date;

public class PosGradua��o extends Aluno{

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