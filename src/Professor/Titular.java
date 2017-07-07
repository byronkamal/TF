package Professor;
import java.text.*;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Titular extends Associado{

	Scanner s;
	
	public void setConcurso() {
		try {
	        s = new Scanner(System.in);
	        System.out.println("Digite uma data: ");
		String concurso2 = s.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
		Date dt = df.parse(concurso2);
		System.out.println(dt);
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Data Concurso", JOptionPane.ERROR_MESSAGE);
	        e.printStackTrace();
	    }
	}
	
	
	public void setDataAdmissao() {
		try {
	        s = new Scanner(System.in);
	        System.out.println("Digite uma data: ");
		String dataAdmissao2 = s.nextLine();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
		Date dt = df.parse(dataAdmissao2);
		System.out.println(dt);
	    } catch (Exception e) {
	    	JOptionPane.showMessageDialog(null, e.getMessage(), "Informacao Faltante: Data Admissao", JOptionPane.ERROR_MESSAGE);
	        e.printStackTrace();
	    }
	}
}