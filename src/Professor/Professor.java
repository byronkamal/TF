package Professor;
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
		System.out.println("\nDigite matricula Siape");
		s = new Scanner(System.in);
		int matriculaSiape2 = s.nextInt();
		this.matriculaSiape = matriculaSiape2;
	}
	
	public int getMatriculaFUB() {
		return matriculaFUB;
	}
	public void setMatriculaFUB() {
		System.out.println("\nDigite matricula FUB:");
		s = new Scanner(System.in);
		int matriuculaFUB2 = s.nextInt();
		this.matriculaFUB = matriculaFUB;
	}
	
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao() {
		System.out.println("\nDigite formacao professor:");
		s = new Scanner(System.in);
		String formacao2 = s.nextLine();
		this.formacao = formacao2;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario() {
		System.out.println("\nDigite salario professor:");
		s = new Scanner(System.in);
		float salario = s.nextFloat();
		this.salario = salario;
	}

}