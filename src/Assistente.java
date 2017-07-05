import java.util.Scanner;

public class Assistente extends Auxiliar{
	
	Scanner s;
	
	private String mestrado;
	private int anoMestrado;
	private String tituloDissertacao;
	
	public String getMestrado() {
		return mestrado;
	}
	public void setMestrado() {
		s = new Scanner(System.in);
		String mestrado2 = s.nextLine();
		this.mestrado = mestrado2;
	}
	
	public int getAnoMestrado() {
		return anoMestrado;
	}
	public void setAnoMestrado() {
		s = new Scanner(System.in);
		int anoMestrado2 = s.nextInt();
		this.anoMestrado = anoMestrado2;
	}
	
	public String getTituloDissertacao() {
		return tituloDissertacao;
	}
	public void setTituloDissertacao() {
		s = new Scanner(System.in);
		String tituloDissertacao2 = s.nextLine();
		this.tituloDissertacao = tituloDissertacao2;
	}
}