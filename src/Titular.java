import java.util.Date;

public class Titular extends Associado{

	private Date concurso;
	private Date dataAdmissao;
	
	public Date getConcurso() {
		return concurso;
	}
	public void setConcurso(Date concurso) {
		this.concurso = concurso;
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}