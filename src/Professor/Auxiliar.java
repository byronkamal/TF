package Professor;
import java.util.Scanner;

public class Auxiliar extends Professor{
	Scanner s;
	
	private String graduacao;
	private int anoGraduacao;
	
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao() {
		System.out.println("\nDigite graduacao professor:");
		s = new Scanner(System.in);
		String graduacao2 = s.nextLine();
		this.graduacao = graduacao2;
	
	}
	public int getAnoGraduacao() {
		return anoGraduacao;
	}
	public void setAnoGraduacao() {
		System.out.println("\nDigite ano graduacao do professor:");
		s = new Scanner(System.in);
		int anoGraduacao2 = s.nextInt();
		this.anoGraduacao = anoGraduacao2;
	}
}