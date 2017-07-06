package Professor;
import java.util.Scanner;

public class Auxiliar extends Professor{
	Scanner s;
	
	private String graduacao;
	private String anoGraduacao;
	
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao() {
		System.out.println("\nDigite graduacao professor:");
		s = new Scanner(System.in);
		String graduacao2 = s.nextLine();
		this.graduacao = graduacao2;
	
	}
	public String getAnoGraduacao() {
		return anoGraduacao;
	}
	public void setAnoGraduacao() {
		System.out.println("\nDigite ano graduacao do professor:");
		s = new Scanner(System.in);
		String anoGraduacao2 = s.nextLine();
		this.anoGraduacao = anoGraduacao2;
	}
}