package Professor;
import java.text.*;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Titular extends Associado{

	Scanner s;
	
	private Date concurso;
	private Date dataAdmissao;
	
	public Date getConcurso() {
		return concurso;
	}
	
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setConcurso() {
		try {
	        s = new Scanner(System.in);
	        System.out.println("Digite uma data: ");
	        System.out.println("Ex: dd/mm/aaaa\n");
		String concurso2 = s.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
		Date dt = df.parse(concurso2);
		System.out.println(dt);
		this.concurso = dt;
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "Informacao Faltante: Data Concurso", "Erro", JOptionPane.ERROR_MESSAGE);
	        e.printStackTrace();
	    }
	}
	
	
	public void setDataAdmissao() {
		try {
	        s = new Scanner(System.in);
	        System.out.println("Digite uma data: ");
	        System.out.println("Ex: dd/mm/aaaa\n");
		String dataAdmissao2 = s.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
		Date dt = df.parse(dataAdmissao2);
		System.out.println(dt);
		this.dataAdmissao = dt;
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, "Informacao Faltante: Data Admissao", "Erro", JOptionPane.ERROR_MESSAGE);
	        e.printStackTrace();
	    }
	}
}