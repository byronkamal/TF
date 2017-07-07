import java.util.Scanner;

import Aluno.*;
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

public class Menu {
	Professor pro;
	Disciplina disc;
	
	Scanner s;
	
	Menu(int opcao) throws InterruptedException {
	
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
	
	}

if(opcaoAluno == 2) {
	PosGraduação pg = new PosGraduação();
	System.out.println("Informações do(a) orientador(a):\n");
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
	System.out.println("Informações do(a) aluno(a):\n");
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
}

if(opcaoAluno == 3) {
	Especial e = new Especial();
	pro = new Professor();
	System.out.println("Informações do(a) orientador(a):\n");
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
	System.out.println("Informações do(a) aluno(a):\n");
	Thread.sleep(50);
	e.setNome();
		Thread.sleep(50);
	e.setNome();
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
}

if(opcaoDisciplina == 2) {
	Estagio e = new Estagio();
	e.setNome();
		Thread.sleep(50);
	e.setNome();
		Thread.sleep(50);
	e.setResponsavel();
		Thread.sleep(50);
	e.setLocaEstagio();
		Thread.sleep(50);
}
return;

case 4:
	Turma t = new Turma();
	Thread.sleep(50);
	disc = new Disciplina();
	Thread.sleep(50);
	pro = new Professor();
	System.out.println("Informações do(a) professor(a) associado(a):\n");
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
	System.out.println("Informações da disciplina:\n");
	disc.setNome();
	Thread.sleep(50);
	disc.setCargaHoraria();
	Thread.sleep(50);
	t.d = disc;
	t.DisciplinaFaltante(disc);
		Thread.sleep(50);
		System.out.println("Informações da turma:\n");
	t.setCodigo();
		Thread.sleep(50);
	t.setHorario();
		Thread.sleep(50);
	return;
	
case 0:
		System.out.println("Terminou!\n");
	return;
	
default:
	System.out.println("Opcao incorreta!");
	return;
	}
	
	}
}