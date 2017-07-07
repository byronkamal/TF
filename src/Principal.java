import java.util.*;

import javax.swing.JOptionPane;

import Aluno.*;
import Professor.*;
import Disciplina.*;
import Turma.*;

public class Principal {

	
	public static void main(String[] args ) throws InterruptedException {
		
		System.out.println(">>>MENU<<<\n" +
				"1 - Cadastrar Aluno\n" + 
				"2 - Cadastrar Professor\n" +
				"3 - Cadastras Disciplina\n" +
				"4 - Cadastrar Turma\n" +
				" 5 - Salvar em arquivo\n" +
				"Digite opcao:");
				Scanner s = new Scanner (System.in);
				int opcao = s.nextInt();
		Menu m = new Menu(opcao);
		
	}
}