package Professor;
import java.util.Scanner;

public class Assistente extends Auxiliar{
	
	Scanner s;
	
	private String mestrado;
	private String anoMestrado;
	private String tituloDissertacao;
	
	public String getMestrado() {
		return mestrado;
	}
	
	
	public void setMestrado() {
		System.out.println("\nDigite mestrado do professor:");
		s = new Scanner(System.in);
		String mestrado2 = s.nextLine();
		this.mestrado = mestrado2;
	}
	
	public String getAnoMestrado() {
		return anoMestrado;
	}
	public void setAnoMestrado() {
		System.out.println("\nDigite ano mestrado:");
		s = new Scanner(System.in);
		String anoMestrado2 = s.nextLine();
		this.anoMestrado = anoMestrado2;
	}
	
	public String getTituloDissertacao() {
		return tituloDissertacao;
	}
	public void setTituloDissertacao() {
		System.out.println("\nDigite titulo da dissertacao:");
		s = new Scanner(System.in);
		String tituloDissertacao2 = s.nextLine();
		this.tituloDissertacao = tituloDissertacao2;
	}
}