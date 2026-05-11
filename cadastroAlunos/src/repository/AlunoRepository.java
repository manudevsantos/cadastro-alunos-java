// Packcage repository - simula um banco de dados contendo a lista de todos os alunos e suas respectivas propriedades.
package src.repository;

// para criar esse armazenamento precisei importar List, Array List e a classe Aluno-model (pois é de lá que vem o molde para conter as informações).
import java.util.ArrayList;
import java.util.List;

import src.model.Aluno;

public class AlunoRepository {

	// Lista estática - serve para que todos os objetos da aplicação utilizem este armazenamento onde ficam todas as informações dos alunos.
	public static List<Aluno> armazem = new ArrayList<>();
}