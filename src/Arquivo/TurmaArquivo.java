package Arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Disciplina.Disciplina;
import Professor.Professor;
import Turma.Turma;

public class TurmaArquivo {
	
	Turma t;
	Professor p;
	Disciplina d;
	
	public TurmaArquivo(Turma t, Professor p, Disciplina d) {
		this.t= t;
		this.p = p;
		this.d = d;
		
	File arquivo = new File("Universide.txt");
	try {
	arquivo.createNewFile();
	FileWriter escrever = new FileWriter(arquivo, true);
	BufferedWriter escreverArq = new BufferedWriter(escrever);
	escreverArq.write("INFOMACOES TURMA:");
	escreverArq.write("COdigo: " + t.getCodigo() );
	escreverArq.newLine();
	escreverArq.write("Horario: " + t.getHorario() );
	escreverArq.newLine();
	escreverArq.write("Matriucla Siape professor associado: " + p.getMatriculaSiape() );
	escreverArq.newLine();
	escreverArq.write("Matricula FUB professor: " + p.getMatriculaFUB() );
	escreverArq.write("Formacao professor: " + p.getFormacao() );
	escreverArq.newLine();
	escreverArq.write("Nome Disciplina: " + d.getNome() );
	escreverArq.newLine();
	escreverArq.write("Carga Horaria Disciplina: " + d.getCargaHoraria() );
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