package Aluno;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Professor.Professor;

public class PosGraduação extends Aluno{
	Scanner s;
	Professor p;
	
	private String semestreQualificacao;
	private Date dataDefesa;
	
	
	public String getSemestreQualificacao() {
		return semestreQualificacao;
	}
	public void setSemestreQualificacao() {
		s = new Scanner(System.in);
		String semestreQualificacao2 = s.nextLine();
		this.semestreQualificacao = semestreQualificacao2;
	}
	
	public Date getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o Ano da data da defesa: \n");
			String recebeData = s.nextLine();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
				Date dt = df.parse(recebeData);	
				this.dataDefesa = dt;
			} catch (ParseException e) {
				e.printStackTrace();
			}
	}
	
}