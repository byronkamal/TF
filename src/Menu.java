//Byron Kamal Barreto Correa - 15/0007281
//Luciana Ribeiro L. de Albuquerque - 15/0016131

import java.util.Scanner;

import Aluno.*;
import Arquivo.*;
import Disciplina.Disciplina;
import Disciplina.Estagio;
import Exceção.InformacaoFaltanteException;
import Professor.Adjunto;
import Professor.Assistente;
import Professor.Associado;
import Professor.Auxiliar;
import Professor.Professor;
import Professor.Titular;
import Turma.Turma;

import java.io.*;

public class Menu {
	Professor pro;
	Disciplina disc;
	
	Scanner s;
	
	Menu(int opcao) throws InterruptedException, IOException {
	
	int numero = opcao;	
	
switch (numero){

case 1:
	System.out.println("Escolha tipo de Aluno:\n" + 
"1 - Graduacao\n" +
"2 - Pos-graduacao\n" +
"3 - Especial\n");
	s = new Scanner(System.in);
int opcaoAluno = s.nextInt();	

if(opcaoAluno == 1) {
	Graduacao g = new Graduacao();
	System.out.println("------------------------------\n");
	System.out.println("--INFORMACOES DO(A) ALUNO(A)--\n");
	g.setNome();
		Thread.sleep(50);
	g.setMatricula();
		Thread.sleep(50);
	g.setSemestreIngresso();
		Thread.sleep(50);
	g.setFormaIngresso();
		Thread.sleep(50);
	g.setCurso();
		Thread.sleep(50);
	g.setProvavelFormatura();
		Thread.sleep(50);
	//Salvar Arquivo
	AlunoArquivo arq = new AlunoArquivo(g);
	Thread.sleep(50);
	
	}

if(opcaoAluno == 2) {
	PosGraduação pg = new PosGraduação();
	System.out.println("-----------------------------------\n");
	System.out.println("--INFORMACOES DO(A) ORIENTADOR(A)--\n");

	pro = new Professor();
	Thread.sleep(50);
	pro.setMatriculaFUB();
	Thread.sleep(50);
	pro.setMatriculaSiape();
	Thread.sleep(50);
	pro.setFormacao();
	Thread.sleep(50);
	pro.setSalario();
	Thread.sleep(50);
	pg.p = pro;
	pg.OrientadorProfessor(pro);
	Thread.sleep(50);
	System.out.println("-----------------------------------------------\n");
	System.out.println("--INFORMACOES DO(A) ALUNO(A) DE POS-GRADUACAO--\n");
	Thread.sleep(50);
	pg.setNome();
		Thread.sleep(50);
	pg.setMatricula();
		Thread.sleep(50);
	pg.setSemestreIngresso();
		Thread.sleep(50);
	pg.setSemestreQualificacao();
		Thread.sleep(50);
	pg.setDataDefesa();
	
	//Salvar Arquivo
	AlunoArquivo arq = new AlunoArquivo(pg);
	Thread.sleep(50);
}

if(opcaoAluno == 3) {
	Especial e = new Especial();
	pro = new Professor();
	System.out.println("-----------------------------------\n");
	System.out.println("--INFORMACOES DO(A) ORIENTADOR(A)--\n");
	Thread.sleep(50);
	pro.setMatriculaFUB();
	Thread.sleep(50);
	pro.setMatriculaSiape();
	Thread.sleep(50);
	pro.setFormacao();
	Thread.sleep(50);
	pro.setSalario();
	Thread.sleep(50);
	e.p = pro;
	e.OrientadorProfessor(pro);
	Thread.sleep(50);
	System.out.println("---------------------------------------\n");
	System.out.println("--INFORMACOES DO(A) ALUNO(A) ESPECIAL--\n");
	Thread.sleep(50);
	e.setNome();
		Thread.sleep(50);
	e.setMatricula();
		Thread.sleep(50);
	e.setSemestreIngresso();
		Thread.sleep(50);
	e.setSemestreQualificacao();
		Thread.sleep(50);
	e.setDataDefesa();
		Thread.sleep(50);
	e.setTaxaPaga();
		Thread.sleep(50);
	e.setSemestreCursado();
		Thread.sleep(50);
	//Salvar Arquivo
	AlunoArquivo arq = new AlunoArquivo(e);
	Thread.sleep(50);
}
return;

case 2:
	System.out.println("Escolha tipo professor:\n" +
"1 - Auxiliar\n" +
"2 - Assistente\n" +
"3 - Adjunto\n"  +
"4 - Associado\n" +
"5 - Titular\n");
s = new Scanner(System.in);
int opcaoProfessor = s.nextInt();

if(opcaoProfessor == 1) {
	Auxiliar a = new Auxiliar();
	System.out.println("----------------------------------\n");
	System.out.println("--INFORMACOES DO(A) PROFESSOR(A)--\n");
		Thread.sleep(50);
	a.setMatriculaSiape();
		Thread.sleep(50);
	a.setMatriculaFUB();
		Thread.sleep(50);
	a.setFormacao();
		Thread.sleep(50);
	a.setSalario();
		Thread.sleep(50);
	a.setGraduacao();
		Thread.sleep(50);
	a.setAnoGraduacao();
		Thread.sleep(50);

	//Salvar arquivo
	ProfessorArquivo arq = new ProfessorArquivo(a);
	Thread.sleep(50);
}

if(opcaoProfessor == 2) {
	Assistente a = new Assistente();
	a.setMatriculaSiape();
		Thread.sleep(50);
	a.setMatriculaFUB();
		Thread.sleep(50);
	a.setFormacao();
		Thread.sleep(50);
	a.setSalario();
		Thread.sleep(50);
	a.setGraduacao();
		Thread.sleep(50);
	a.setAnoGraduacao();
		Thread.sleep(50);
	a.setMestrado();
		Thread.sleep(50);
	a.setAnoMestrado();
		Thread.sleep(50);
	a.setTituloDissertacao();
		Thread.sleep(50);
	
	//Salvar arquivo
	ProfessorArquivo arq = new ProfessorArquivo(a);
	Thread.sleep(50);
}

if(opcaoProfessor == 3) {
	Adjunto a = new Adjunto();
	a.setMatriculaSiape();
		Thread.sleep(50);
	a.setMatriculaFUB();
		Thread.sleep(50);
	a.setFormacao();
		Thread.sleep(50);
	a.setSalario();
		Thread.sleep(50);
	a.setGraduacao();
		Thread.sleep(50);
	a.setAnoGraduacao();
		Thread.sleep(50);
	a.setMestrado();
		Thread.sleep(50);
	a.setAnoMestrado();
		Thread.sleep(50);
	a.setTituloDissertacao();
		Thread.sleep(50);
	a.setDoutorado();
		Thread.sleep(50);
	a.setAnoDoutorado();
		Thread.sleep(50);
	a.setTituloTese();
		Thread.sleep(50);
	
	//Salvar arquivo
	ProfessorArquivo arq = new ProfessorArquivo(a);	
	Thread.sleep(50);
	
}

if(opcaoProfessor == 4) {
	Associado a = new Associado();
	a.setMatriculaSiape();
		Thread.sleep(50);
	a.setMatriculaFUB();
		Thread.sleep(50);
	a.setFormacao();
		Thread.sleep(50);
	a.setSalario();
		Thread.sleep(50);
	a.setGraduacao();
		Thread.sleep(50);
	a.setAnoGraduacao();
		Thread.sleep(50);
	a.setMestrado();
		Thread.sleep(50);
	a.setAnoMestrado();
		Thread.sleep(50);
	a.setTituloDissertacao();
		Thread.sleep(50);
	a.setDoutorado();
		Thread.sleep(50);
	a.setAnoDoutorado();
		Thread.sleep(50);
	a.setTituloTese();
		Thread.sleep(50);
	a.setAreaPesquisa();
		Thread.sleep(50);
	
	//Salvar arquivo
	ProfessorArquivo arq = new ProfessorArquivo(a);
	Thread.sleep(50);
}
	
if(opcaoProfessor == 5) {
	Titular t = new Titular();
	t.setMatriculaSiape();
		Thread.sleep(50);
	t.setMatriculaFUB();
		Thread.sleep(50);
	t.setFormacao();
		Thread.sleep(50);
	t.setSalario();
		Thread.sleep(50);
	t.setGraduacao();
		Thread.sleep(50);
	t.setAnoGraduacao();
		Thread.sleep(50);	
	t.setMestrado();
		Thread.sleep(50);
	t.setAnoMestrado();
		Thread.sleep(50);
	t.setTituloDissertacao();
		Thread.sleep(50);
	t.setDoutorado();
		Thread.sleep(50);
	t.setAnoDoutorado();
		Thread.sleep(50);
	t.setTituloTese();
		Thread.sleep(50);
	t.setAreaPesquisa();
		Thread.sleep(50);
	t.setConcurso();
		Thread.sleep(50);
	t.setDataAdmissao();
		Thread.sleep(50);
		
	//Salvar arquivo
	ProfessorArquivo arq = new ProfessorArquivo(t);
	Thread.sleep(50);
}
return;
	
case 3:
	System.out.println("Escolha tipo disciplina\n" +
"1 - Disciplina\n"+ 
"2 - Estagio\n");
s = new Scanner(System.in);
int opcaoDisciplina = s.nextInt();

if(opcaoDisciplina == 1) {
	Disciplina d = new Disciplina();
	d.setNome();
		Thread.sleep(50);
	d.setCargaHoraria();
		Thread.sleep(50);
		
	//Salvar Arquivo	
	DisciplinaArquivo arq = new DisciplinaArquivo(d);
	Thread.sleep(50);
}

if(opcaoDisciplina == 2) {
	Professor pro = new Professor();
	Estagio e = new Estagio();
	
	System.out.println("-----------------------------------\n");
	System.out.println("--INFORMACOES DO(A) PROFESSOR RESPONSAVEL--\n");
	e.setResponsavel();
	Thread.sleep(50);
	pro.setMatriculaSiape();
	Thread.sleep(50);
	pro.setMatriculaFUB();
	Thread.sleep(50);
	pro.setFormacao();
	e.p = pro;
	System.out.println("-----------------------------------\n");
	System.out.println("--INFORMACOES DO(A) ALUNO(A) DE ESTAGIO--\n");
	e.setNome();
		Thread.sleep(50);
	e.setCargaHoraria();
		Thread.sleep(50);
	e.setLocaEstagio();
		Thread.sleep(50);
		
	//Salvar Arquivo	
	DisciplinaArquivo arq = new DisciplinaArquivo(e, pro);
	Thread.sleep(50);
}
return;

case 4:
	Turma t = new Turma();
	Thread.sleep(50);
	disc = new Disciplina();
	Thread.sleep(50);
	pro = new Professor();
	System.out.println("-----------------------------------------------\n");
	System.out.println("--INFORMACOES DO(A) PROFESSOR(A) ASSOCIADO(A)--\n");
	Thread.sleep(50);
	pro.setMatriculaFUB();
	Thread.sleep(50);
	pro.setMatriculaSiape();
	Thread.sleep(50);
	pro.setFormacao();
	Thread.sleep(50);
	pro.setSalario();
	Thread.sleep(50);
	t.p = pro;
	t.ProfessorFaltante(pro);
	Thread.sleep(50);
	System.out.println("-----------------------------\n");
	System.out.println("--INFORMACOES DA DISCIPLINA--\n");
	disc.setNome();
	Thread.sleep(50);
	disc.setCargaHoraria();
	Thread.sleep(50);
	t.d = disc;
	t.DisciplinaFaltante(disc);
		Thread.sleep(50);
		System.out.println("------------------------\n");
		System.out.println("--INFORMACOES DA TURMA--\n");
	t.setCodigo();
		Thread.sleep(50);
	t.setHorario();
		Thread.sleep(50);
		
	//Salvar Arquivo
	TurmaArquivo arq = new TurmaArquivo(t, pro, disc);
	Thread.sleep(50);
	return;
	
case 0:
		System.out.println("Programa Encerrado!\n");
	return;
	
default:
	System.out.println("Opcao Incorreta!");
	Thread.sleep(50);
	return;
	}
	
	}
}
