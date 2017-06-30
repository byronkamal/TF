import java.util.Date;

public class Graduação extends Aluno {

	private String formaIngresso;
	private String curso;
	private Date provavelFormatura;
	
	public String getFormaIngresso(){
		return formaIngresso;
	}
	
	public void setFormaIngresso(String formaIngresso){
		this.formaIngresso = formaIngresso;
	}
	
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso (String curso) {
		this.curso = curso;
	}
	
	
	public Date getProvaevlFormatura() {
		return provavelFormatura;
	}
	
	public void setProvavelFormatura() {
		this.provavelFormatura = provavelFormatura;
	}
}