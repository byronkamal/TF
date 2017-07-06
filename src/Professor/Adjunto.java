package Professor;
import java.util.Scanner;

public class Adjunto extends Assistente{

	Scanner s;
	
	private String doutorado;
	private String anoDoutorado;
	private String tituloTese;
	
	public String getDoutorado() {
		return doutorado;
	}
	public void setDoutorado() {
		System.out.println("\nDigite doutorado:");
		s = new Scanner(System.in);
		String doutorado2 = s.nextLine();
		this.doutorado = doutorado2;
	}
	
	public String getAnoDoutorado() {
		return anoDoutorado;
	}
	public void setAnoDoutorado() {
		System.out.println("\nDigite ano doutorado:");
		s = new Scanner(System.in);
		String anoDoutorado2 = s.nextLine();
		this.anoDoutorado = anoDoutorado2;
	}
	
	public String getTituloTese() {
		return tituloTese;
	}
	public void setTituloTese() {
		s = new Scanner(System.in);
		String tituloTese2 = s.nextLine();
		this.tituloTese = tituloTese2;
	}
}