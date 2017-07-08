package Arquivo;

import java.awt.Menu;
import java.io.*;
import Aluno.*;

public class AlunoArquivo {

	private Graduacao g;
	private PosGraduação pg;
	private Especial e;
	private Menu m;
	
	public AlunoArquivo(Graduacao g) {
		this.g = g;
		File arquivo = new File("Universidade.txt");
		try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("------------------------------");
		escreverArq.write("\nINFOMACOES ALUNO GRADUACAO\n");
		escreverArq.newLine();
		escreverArq.write("Nome: " + g.getNome() );
		escreverArq.newLine();
		escreverArq.write("Matricula: " + g.getMatricula() );
		escreverArq.newLine();
		escreverArq.write("Semestre ingresso: " + g.getSemestreIngresso() ); 
		escreverArq.newLine();
		escreverArq.write("Forma ingresso: " + g.getFormaIngresso() ); 
		escreverArq.newLine();
		escreverArq.write("Curso: " + g.getCurso() ); 
		escreverArq.newLine();
		escreverArq.write("Provavel formatura: " + g.getProvavelFormatura() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}
	
	public AlunoArquivo(PosGraduação pg) {
		this.pg = pg;
		File arquivo = new File("Universidade.txt");
		try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("------------------------------");
		escreverArq.write("\nINFOMACOES ALUNO POS-GRADUACAO:\n");
		escreverArq.newLine();
		escreverArq.write("Nome: " + pg.getNome() );
		escreverArq.newLine();
		escreverArq.write("Matricula: " + pg.getMatricula() );
		escreverArq.newLine();
		escreverArq.write("Semestre ingresso: " + pg.getSemestreIngresso() ); 
		escreverArq.newLine();
		escreverArq.write("Semestre Qualificacao: " + pg.getSemestreQualificacao() ); 
		escreverArq.newLine();
		escreverArq.write("Data Defesa:" + pg.getDataDefesa() ); 
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e2){
			System.out.println("\n" + e2.getMessage());
		}
	}
	
	public AlunoArquivo(Especial e) {
	this.e = e;
	File arquivo = new File("Universidade.txt");
	try {
	arquivo.createNewFile();
	FileWriter escrever = new FileWriter(arquivo, true);
	BufferedWriter escreverArq = new BufferedWriter(escrever);
	escreverArq.write("--------------------------");
	escreverArq.write("\nINFOMACOES ALUNO ESPECIAL:\n");
	escreverArq.newLine();
	escreverArq.write("Nome: " + e.getNome() );
	escreverArq.newLine();
	escreverArq.write("Matricula: " + e.getMatricula() );
	escreverArq.newLine();
	escreverArq.write("Semestre ingresso: " + e.getSemestreIngresso() ); 
	escreverArq.newLine();
	escreverArq.write("Semestre Qualificacao: " + e.getSemestreQualificacao() ); 
	escreverArq.newLine();
	escreverArq.write("Data Defesa:" + e.getDataDefesa() ); 
	escreverArq.newLine();
	escreverArq.write("Taxa paga:" + e.getTaxaPaga() ); 
	escreverArq.newLine();
	escreverArq.write("Semestre Cursado:" + e.getSemestreCursado() ); 
	escreverArq.newLine();
	escreverArq.close();
	escrever.close();
	System.out.println("Arquivo Salvo com sucesso!!\n");
	}
	catch (IOException e3){
		System.out.println("\n" + e3.getMessage());
	}
	
	
	}
}