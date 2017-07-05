package Professor;
import java.util.Scanner;

public class Adjunto extends Assistente{

	Scanner s;
	
	private String doutorado;
	private int anoDoutorado;
	private String tituloTese;
	
	public String getDoutorado() {
		return doutorado;
	}
	public void setDoutorado() {
		s = new Scanner(System.in);
		String doutorado2 = s.nextLine();
		this.doutorado = doutorado2;
	}
	
	public int getAnoDoutorado() {
		return anoDoutorado;
	}
	public void setAnoDoutorado() {
		s = new Scanner(System.in);
		int anoDoutorado2 = s.nextInt();
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