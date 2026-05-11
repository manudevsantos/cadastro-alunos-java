// packcage controller - Fica responsável pela interação com o usuário. Ex: Se o usuário pede para ver a lista de alunos, o controller pega o método do service que faz essa função e entrega ao usuário.
//--------------------------------------------
package src.controller;

import java.util.List;
import java.util.Scanner;
import src.model.Aluno;
import src.service.*;;


public class AlunoController {

// aqui eu criei os métodos que irão chamar outros métodos no service

// relacionado ao método 1 do service - cadastroAlunos
// método público, estático chamado createAlunoController que não trará um retorno, irá apenas pegar os dados/informações que o usuário vai digitar e acionar o método do service responsável por atender a solicitação.
public static void createAlunoController () {

Scanner scan = new Scanner(System.in);

//criando um novo objeto do tipo AlunoService que se chama funcAluno
AlunoService funcAluno = new AlunoService();

String nome;
int idade = 0;
String turma;
String telefone;
String nascimento;
String conf;
boolean inter = true;


System.out.println();
System.out.println("============== CADASTRO DE ALUNOS ====================");
System.out.println();

System.out.println("Digite o nome do aluno: ");
nome = scan.nextLine();
System.out.println();


while(inter) {
			try {
				System.out.print("Digite a idade do aluno: ");
				System.out.println();
				idade = scan.nextInt();
				scan.nextLine();
				System.out.println();
				inter = false;
				}
			
			catch (Exception e) {
				scan.nextLine();
				System.out.println("dados inválidos, escreva em números: ");
				System.out.println();
			}

		}

System.out.println("Turma: ");
turma = scan.nextLine();
System.out.println();

System.out.println("Telefone: ");
telefone = scan.nextLine();
System.out.println();

System.out.println("Data de nascimento: ");
nascimento = scan.nextLine();
System.out.println();

conf = funcAluno.cadastroAlunos(nome, idade, turma, telefone, nascimento);

System.out.println(conf);
System.out.println();

}
//-------------------------------------------------------------------------------

// relacionado ao método 2 do service - listarAlunos
// método público estático chamado listAllAlunosController que não irá me retornar um resultado, irá apenas exibir uma lista.
public static void listAllAlunosController () {

AlunoService funcAluno = new AlunoService();


System.out.println();
System.out.println("================== LISTA DE ALUNOS ==========================");
System.out.println();

List<Aluno> listaParaExibir = funcAluno.listarAlunos();

	for ( int i=0; i<listaParaExibir.size(); i++){

		Aluno alunosCadastrados = listaParaExibir.get(i);

		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Aluno " +  (i+1) + " : " + alunosCadastrados.getNome());
		System.out.println("Idade: " + alunosCadastrados.getIdade());
		System.out.println("Turma: " + alunosCadastrados.getTurma());
		System.out.println("Telefone: " + alunosCadastrados.getTelefone());
		System.out.println("Data de nascimento: "  + alunosCadastrados.getNascimento());
		System.out.println("---------------------------------------------------------");
		System.out.println();

	}

	if (listaParaExibir.size () == 0) {

		System.out.println();
		System.out.println("Não existe aluno cadastrado.");
		System.out.println();

	}
}


//-------------------------------------------------------------------------------


// relacionado ao método 3 do service - bucarAluno
// método público e estático chamado findByAluno que tem como objetivo buscar os dados do aluno através do nome
public static void findByAlunoController () {

// vamos utilizar o scan para perguntar o nome que o usuário deseja buscar
Scanner scan = new Scanner(System.in);

// as variaveis: o nome que está sendo procurado (string) e o nome encontrado com as informações (idade, turma, etc...) obs. 
String nomeBusca;
Aluno alunoEncontrado;

AlunoService funcAluno = new AlunoService();

System.out.println();
System.out.println("Digite o nome que deseja buscar: ");
nomeBusca = scan.nextLine();
System.out.println();

// o nome do aluno encontrado é igual a funcAluno (nome do objeto criado) ativando o método buscarAluno no service utilizando o nome da busca.
alunoEncontrado = funcAluno.buscarAluno(nomeBusca);

// se o nome do aluno encontrado for diferente de null (se não estiver vazio), 
if (alunoEncontrado != null) {

// mostre essa mensagem:
System.out.println();
System.out.println("---------------------------------------------------------");
System.out.println("Aluno encontrado : " + (alunoEncontrado.getNome()));
System.out.println("Idade : " + (alunoEncontrado.getIdade()));
System.out.println("Turma : " + (alunoEncontrado.getTurma()));
System.out.println("Telefone : " + (alunoEncontrado.getTelefone()));
System.out.println("Data de nascimento : " + (alunoEncontrado.getNascimento()));
System.out.println("---------------------------------------------------------");
System.out.println();


// se não, 
} else {

//mostre essa mensagem
System.out.println("Aluno não encontrado no sistema");
System.out.println();

}

}
//-------------------------------------------------------------------------------


// relacionado ao método 4 do service - deletar
// método público e estático chamado removeAluno - tem o objetivo de remover os dados de um aluno
public static void removeAlunoController () {

Scanner scan = new Scanner(System.in);

String nomeBusca;
String  alunoRemovido;

AlunoService funcAluno = new AlunoService();

System.out.println();
System.out.println("Digite o nome do aluno que deseja remover do sistema: ");
nomeBusca = scan.nextLine();
System.out.println();

alunoRemovido = funcAluno.deletar(nomeBusca);

if (alunoRemovido != null) {
	
System.out.println();
System.out.println("---------------------------------------------------------");
System.out.println("Aluno removido com sucesso! -  " + alunoRemovido);
System.out.println("---------------------------------------------------------");
System.out.println();
System.out.println();

} else {

	System.out.println("Aluno não encontrado no sistema.");

}

}
}