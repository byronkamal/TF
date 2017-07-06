import java.util.Scanner;

import Aluno.Especial;
import Aluno.Graduacao;
import Aluno.PosGraduação;
import Disciplina.Disciplina;
import Disciplina.Estagio;
import Exceção.InformacaoFaltanteException;
import Professor.Adjunto;
import Professor.Assistente;
import Professor.Associado;
import Professor.Auxiliar;
import Professor.Titular;
import Turma.Turma;

public class Menu {
	
	Scanner s;
	
	Menu(int num) {
	
	int numero = num;
	
	do {
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
	g.setMatricula();
	g.setSemestreIngresso();
	g.setFormaIngresso();
	g.setCurso();
	g.setProvavelFormatura();
	
	}

if(opcaoAluno == 2) {
	PosGraduação pg = new PosGraduação();
	pg.setNome();
	pg.setMatricula();
	pg.setSemestreIngresso();
	pg.setSemestreQualificacao();
	pg.setDataDefesa();
}

if(opcaoAluno == 3) {
	Especial e = new Especial();
	e.setNome();
	e.setNome();
	e.setSemestreIngresso();
	e.setSemestreQualificacao();
	e.setDataDefesa();
	e.setTaxaPaga();
	e.setSemestreCursado();
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
	a.setMatriculaFUB();
	a.setFormacao();
	a.setFormacao();
	a.setSalario();
	a.setGraduacao();
	a.setAnoGraduacao();
}

if(opcaoProfessor == 2) {
	Assistente a = new Assistente();
	a.setMatriculaSiape();
	a.setMatriculaFUB();
	a.setFormacao();
	a.setSalario();
	a.setGraduacao();
	a.setAnoGraduacao();
	a.setMestrado();
	a.setAnoMestrado();
	a.setTituloDissertacao();
}

if(opcaoProfessor == 3) {
	Adjunto a = new Adjunto();
	a.setMatriculaSiape();
	a.setFormacao();
	a.setSalario();
	a.setGraduacao();
	a.setAnoGraduacao();
	a.setMestrado();
	a.setAnoGraduacao();
	a.setMestrado();
	a.setAnoMestrado();
	a.setTituloDissertacao();
	a.setDoutorado();
	a.setAnoDoutorado();
	a.setTituloTese();
	a.setMatriculaFUB();
}

if(opcaoProfessor == 4) {
	Associado a = new Associado();
	a.setMatriculaSiape();
	a.setMatriculaFUB();
	a.setFormacao();
	a.setSalario();
	a.setGraduacao();
	a.setAnoGraduacao();
	a.setMestrado();
	a.setAnoMestrado();
	a.setTituloDissertacao();
	a.setDoutorado();
	a.setAnoDoutorado();
	a.setTituloTese();
	a.setAreaPesquisa();
}
	
if(opcaoProfessor == 5) {
	Titular t = new Titular();
	t.setMatriculaSiape();
	t.setMatriculaFUB();
	t.setFormacao();
	t.setSalario();
	t.setGraduacao();
	t.setAnoGraduacao();
	t.setMestrado();
	t.setAnoMestrado();
	t.setTituloDissertacao();
	t.setDoutorado();
	t.setAnoDoutorado();
	t.setTituloTese();
	t.setAreaPesquisa();
	t.setConcurso();
	t.setDataAdmissao();
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
	d.setNome();
}

if(opcaoDisciplina == 2) {
	Estagio e = new Estagio();
	e.setNome();
	e.setNome();
	e.setResponsavel();
	e.setLocaEstagio();
}
return;

case 4:
	Turma t = new Turma();
	t.setCodigo();
	t.setHorario();
	System.out.println("Digite informacoes de Turma:\n");
	return;
	
default:
	System.out.println("Opcao incorreta!");
	return;
		}
	}while(numero != 0);
}
	
}