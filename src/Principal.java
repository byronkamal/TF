import java.util.*;

import javax.swing.JOptionPane;

import Aluno.*;
import Professor.*;
import Disciplina.*;
import Turma.*;

public class Principal {

	
	public static void main(String[] args ) throws InterruptedException {
		
		
		int opcao;
		Scanner s = new Scanner(System.in);
		Menu m;
		
		while (true) {
		Thread.sleep(100);
		System.out.println("\n\n>>>MENU<<<\n" +
				"1 - Cadastrar Aluno\n" + 
				"2 - Cadastrar Professor\n" +
				"3 - Cadastras Disciplina\n" +
				"4 - Cadastrar Turma\n" +
				"0 - Sair\n" +
				"Digite opcao:");
		opcao = s.nextInt();
		m = new Menu(opcao);
		
		if (opcao == 0) {
			System.exit(0);
		}
		
		}
	}
}