package Aluno;
import java.util.Scanner;


public class Especial extends PosGraduação{
	
	private boolean taxaPaga;
	private String semestreCursado;
	
	public boolean isTaxaPaga() {
		return taxaPaga;
	}
	
	public void setTaxaPaga() {
		Boolean taxa2;
		Scanner s = new Scanner(System.in);
		System.out.println("A taxa foi paga? \n");
		taxa2 = s.nextBoolean();
		this.taxaPaga = taxaPaga;
	}
	
	
	public String getSemestreCursado() {
		return semestreCursado;
	}
	
	public void setSemestreCursado() {
		String semestre2;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o semestre cursado: \n");
		semestre2 = s.nextLine();
		this.semestreCursado = semestreCursado;
	}
	
}
