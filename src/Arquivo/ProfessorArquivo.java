package Arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Professor.*;

public class ProfessorArquivo {

	private Adjunto adj;
	private Assistente as;
	private Associado asso;
	private Auxiliar aux;
	private Titular t;
	
	public ProfessorArquivo(Auxiliar aux) {
		this.aux = aux;
	File arquivo = new File("Universide.txt");
	
	try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("INFOMACOES PROFESSOR ADJUNTO:");
		escreverArq.write("Matriucla Siape: " + aux.getMatriculaSiape() );
		escreverArq.newLine();
		escreverArq.write("Matricula FUB: " + aux.getMatriculaFUB() );
		escreverArq.newLine();
		escreverArq.newLine();
		escreverArq.write("Formacao: " + aux.getFormacao() ); 
		escreverArq.newLine();
		escreverArq.write("Salario:" + aux.getSalario() ); 
		escreverArq.newLine();
		escreverArq.write("Graduacao: " + aux.getGraduacao() ); 
		escreverArq.newLine();
		escreverArq.write("Ano Graduacao " + aux.getAnoGraduacao() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}
	
	ProfessorArquivo(Assistente as) {
		this.as = as;
	File arquivo = new File("Universide.txt");
	
	try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("INFOMACOES PROFESSOR ASSISTENTE:");
		escreverArq.write("Matriucla Siape: " + as.getMatriculaSiape() );
		escreverArq.newLine();
		escreverArq.write("Matricula FUB: " + as.getMatriculaFUB() );
		escreverArq.newLine();
		escreverArq.newLine();
		escreverArq.write("Formacao: " + as.getFormacao() ); 
		escreverArq.newLine();
		escreverArq.write("Salario:" + as.getSalario() ); 
		escreverArq.newLine();
		escreverArq.write("Graduacao: " + as.getGraduacao() ); 
		escreverArq.newLine();
		escreverArq.write("Ano Graduacao: " + as.getAnoGraduacao() );
		escreverArq.newLine();
		escreverArq.write("Mestrado: " + as.getMestrado() );
		escreverArq.newLine();
		escreverArq.write("Ano mestrado: " + as.getAnoMestrado() );
		escreverArq.newLine();
		escreverArq.write("Titulo Dissertacao: " + as.getTituloDissertacao() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}
	
	public ProfessorArquivo(Adjunto adj) {
		this.adj = adj;
	File arquivo = new File("Universide.txt");
	
	try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.newLine();
		escreverArq.write("Matriucla Siape: " + adj.getMatriculaSiape() );
		escreverArq.newLine();
		escreverArq.write("Matricula FUB: " + adj.getMatriculaFUB() );
		escreverArq.newLine();
		escreverArq.newLine();
		escreverArq.write("Formacao: " + adj.getFormacao() ); 
		escreverArq.newLine();
		escreverArq.write("Salario:" + adj.getSalario() ); 
		escreverArq.newLine();
		escreverArq.write("Graduacao: " + adj.getGraduacao() ); 
		escreverArq.newLine();
		escreverArq.write("Ano Graduacao: " + adj.getAnoGraduacao() );
		escreverArq.newLine();
		escreverArq.write("Mestrado: " + adj.getMestrado() );
		escreverArq.newLine();
		escreverArq.write("Ano mestrado: " + adj.getAnoMestrado() );
		escreverArq.newLine();
		escreverArq.write("Titulo Dissertacao: " + adj.getTituloDissertacao() );
		escreverArq.newLine();
		escreverArq.write("Doutorado: " + adj.getDoutorado() );
		escreverArq.newLine();
		escreverArq.write("Ano doutorado:" + adj.getAnoDoutorado() );
		escreverArq.newLine();
		escreverArq.write("Titulo tese: " + adj.getTituloTese() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}
	
	public ProfessorArquivo(Associado asso) {
		this.asso = asso;
	File arquivo = new File("Universide.txt");
	
	try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("INFOMACOES PROFESSOR ADJUNTO:");
		escreverArq.write("Matriucla Siape: " + asso.getMatriculaSiape() );
		escreverArq.newLine();
		escreverArq.write("Matricula FUB: " + asso.getMatriculaFUB() );
		escreverArq.newLine();
		escreverArq.newLine();
		escreverArq.write("Formacao: " + asso.getFormacao() ); 
		escreverArq.newLine();
		escreverArq.write("Salario:" + asso.getSalario() ); 
		escreverArq.newLine();
		escreverArq.write("Graduacao: " + asso.getGraduacao() ); 
		escreverArq.newLine();
		escreverArq.write("Ano Graduacao: " + asso.getAnoGraduacao() );
		escreverArq.newLine();
		escreverArq.write("Mestrado: " + asso.getMestrado() );
		escreverArq.newLine();
		escreverArq.write("Ano mestrado: " + asso.getAnoMestrado() );
		escreverArq.newLine();
		escreverArq.write("Titulo Dissertacao: " + asso.getTituloDissertacao() );
		escreverArq.newLine();
		escreverArq.write("Doutorado: " + asso.getDoutorado() );
		escreverArq.newLine();
		escreverArq.write("Ano doutorado:" + asso.getAnoDoutorado() );
		escreverArq.newLine();
		escreverArq.write("Titulo tese: " + asso.getTituloTese() );
		escreverArq.newLine();
		escreverArq.write("Area de Pesquisa: " + asso.getAreaPesquisa() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}

	
	public ProfessorArquivo(Titular t) {
		this.t = t;
	File arquivo = new File("Universide.txt");
	
	try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("INFOMACOES PROFESSOR ADJUNTO:");
		escreverArq.write("Matriucla Siape: " + t.getMatriculaSiape() );
		escreverArq.newLine();
		escreverArq.write("Matricula FUB: " + t.getMatriculaFUB() );
		escreverArq.newLine();
		escreverArq.newLine();
		escreverArq.write("Formacao: " + t.getFormacao() ); 
		escreverArq.newLine();
		escreverArq.write("Salario:" + t.getSalario() ); 
		escreverArq.newLine();
		escreverArq.write("Graduacao: " + t.getGraduacao() ); 
		escreverArq.newLine();
		escreverArq.write("Ano Graduacao: " + t.getAnoGraduacao() );
		escreverArq.newLine();
		escreverArq.write("Mestrado: " + t.getMestrado() );
		escreverArq.newLine();
		escreverArq.write("Ano mestrado: " + t.getAnoMestrado() );
		escreverArq.newLine();
		escreverArq.write("Titulo Dissertacao: " + t.getTituloDissertacao() );
		escreverArq.newLine();
		escreverArq.write("Doutorado: " + t.getDoutorado() );
		escreverArq.newLine();
		escreverArq.write("Ano doutorado:" + t.getAnoDoutorado() );
		escreverArq.newLine();
		escreverArq.write("Titulo tese: " + t.getTituloTese() );
		escreverArq.newLine();
		escreverArq.write("Area de Pesquisa: " + t.getAreaPesquisa() );
		escreverArq.newLine();
		escreverArq.write("Concurso: " + t.getConcurso() );
		escreverArq.newLine();
		escreverArq.write("Data Admissao: " + t.getDataAdmissao() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}
}