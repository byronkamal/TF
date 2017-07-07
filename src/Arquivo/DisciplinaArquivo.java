package Arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Disciplina.*;
import Professor.*;

public class DisciplinaArquivo {

	Disciplina d;
	Estagio e;
	Professor pro;
	
	//Parametro Disciplina d
	public DisciplinaArquivo(Disciplina d) {
		this.d = d;
		
		File arquivo = new File("Universide.txt");
		try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("INFOMACOES DISCIPLINA:");
		escreverArq.write("Nome: " + d.getNome() );
		escreverArq.newLine();
		escreverArq.write("Carga Horaria: " + d.getCargaHoraria() );
		escreverArq.newLine();
		escreverArq.close();
		escrever.close();
		System.out.println("Arquivo Salvo com sucesso!!\n");
		}
		catch (IOException e1){
			System.out.println("\n" + e1.getMessage());
		}
	}
		
	//Parametro estagio e professor
	public DisciplinaArquivo(Estagio e, Professor pro) {
		this.e = e;
		this.pro = pro;
		
		File arquivo = new File("Universide.txt");
		try {
		arquivo.createNewFile();
		FileWriter escrever = new FileWriter(arquivo, true);
		BufferedWriter escreverArq = new BufferedWriter(escrever);
		escreverArq.write("INFOMACOES ESTAGIO:");
		escreverArq.newLine();
		escreverArq.write("Nome: " + e.getNome() );
		escreverArq.newLine();
		escreverArq.write("Carga Horaria: " + e.getCargaHoraria() );
		escreverArq.newLine();
		escreverArq.write("Local estagio: " + e.getLocalEstagio() );
		escreverArq.newLine();
		escreverArq.write("INFOMACOES PROFESSOR RESPONSAVEL:");
		escreverArq.write("Professor Responsalvel: " + e.getResponsavel() );
		escreverArq.write("Matricula Siape: " + pro.getMatriculaSiape() );
		escreverArq.newLine();
		escreverArq.write("Matriucula FUB: " + pro.getMatriculaFUB() );
		escreverArq.newLine();
		escreverArq.write("Formacao: " + pro.getFormacao() );
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