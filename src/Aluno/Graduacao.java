package Aluno;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Graduacao extends Aluno {

	private String formaIngresso;
	private String curso;
	private Date provavelFormatura;
	
	public String getFormaIngresso(){
		return formaIngresso;
	}
	
	public void setFormaIngresso(){
		String formaIngresso2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a Forma de Ingresso na Universidade: \n");
		formaIngresso2 = s.nextLine();
		this.formaIngresso = formaIngresso2;
	}
	
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso () {
		String curso2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o Curso: \n");
		curso2 = s.nextLine();
		this.curso = curso;
	}
	
	
	public Date getProvavelFormatura() {
		return provavelFormatura;
	}
	
	public void setProvavelFormatura() {
		try {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a data de provavel Formatura: \n");
		String recebeData = s.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
			Date dt = df.parse(recebeData);	
			this.provavelFormatura = dt;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
	}
}