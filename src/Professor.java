import java.util.Scanner;

public class Professor {
	Scanner s;
	
	private int matriculaSiape;
	private int matriculaFUB;
	private String formacao;
	private float salario;
	
	public int getMatriculaSiape() {
		return matriculaSiape;
	}
	public void setMatriculaSiape() {
		s = new Scanner(System.in);
		int matriculaSiape2 = s.nextInt();
		this.matriculaSiape = matriculaSiape2;
	}
	
	public int getMatriculaFUB() {
		return matriculaFUB;
	}
	public void setMatriculaFUB() {
		s = new Scanner(System.in);
		int matriuculaFUB2 = s.nextInt();
		this.matriculaFUB = matriculaFUB;
	}
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario() {
		s = new Scanner(System.in);
		float salario = s.nextFloat();
		this.salario = salario;
	}

}