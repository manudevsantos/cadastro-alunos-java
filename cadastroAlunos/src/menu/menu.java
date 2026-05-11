package src.menu;

import java.util.Scanner;


import src.controller.*;

public class menu {

public static void menu () {

Scanner scan = new Scanner(System.in);

int escolha;

AlunoController menuAlunos = new AlunoController();

while (true) {

System.out.println("================= SISTEMA DE CADASTRO DE ALUNOS =====================");
System.out.println();
System.out.println("1 - Cadastrar alunos");
System.out.println();
System.out.println("2 - Listar alunos");
System.out.println();
System.out.println("3 - Buscar alunos");
System.out.println();
System.out.println("4 - Remover aluno");
System.out.println();
System.out.println("5 - Sair");
System.out.println();
System.out.println("--------------------------------------------------------------------");
System.out.println();
System.out.println("Escolha uma opção:");


escolha = scan.nextInt();


switch (escolha) {

   case 1:
    menuAlunos.createAlunoController ();
    break;

   case 2:
    menuAlunos.listAllAlunosController ();
    break;

   case 3: 
    menuAlunos.findByAlunoController ();
    break;

   case 4:
    menuAlunos.removeAlunoController();
    break;

   case 5:
    System.out.println();
    System.out.println("Saindo do sistema... Até logo!");
    System.out.println();
    break;

   default:
    System.out.println();
    System.out.println("Opção inválida!");
    System.out.println();
    break;

}      
}


}
}

