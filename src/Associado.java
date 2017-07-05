import java.util.Scanner;

public class Associado extends Adjunto {

	Scanner s;
	
	private String areaPesquisa;
	
	public String getAreaPesquisa() {
		return areaPesquisa;
	}
	public void setAreaPesquisa(){
		s = new Scanner(System.in);
		String areaPesquisa2 = s.nextLine();
		this.areaPesquisa = areaPesquisa;
	}
}