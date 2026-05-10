// packcage service - é onde ficam os métodos que serão utilizados na aplicação. Os método desempenham funções específicas quando solicitadas pelo usuário.
package src.service;

import src.model.Aluno;
import src.repository.AlunoRepository;

import java.util.ArrayList;
import java.util.List;


public class AlunoService{


// 1. Método para cadastrar um novo aluno
// método público stático chamado cadastroAlunos que vai me devolver um objeto do tipo String (contendo nomeAluno, idadeAluno, etc...)

public String cadastroAlunos (String nomeAluno, int idadeAluno, String turmaAluno, String telefoneAluno, String nascimentoAluno) {

    // criando novo objeto do tipo Aluno que se chama novoAluno
    Aluno novoAluno = new Aluno();

    // o novo objeto chamado novoAluno pegou para si as informações que estão na variável nome, idade, turma, telefone e nascimento, e guardou.
    novoAluno.setNome(nomeAluno);
    novoAluno.setIdade(idadeAluno);
    novoAluno.setTurma(turmaAluno);
    novoAluno.setTelefone(telefoneAluno);
    novoAluno.setNascimento(nascimentoAluno);

    // chamei a lista que está no repository e guardei as informações na lista.
    AlunoRepository.armazem.add(novoAluno);

    // Recado para dizer que as informações foram guardadas!
    return "Aluno " + nomeAluno + " Cadastrado com sucesso!";
}

//-------------------------------------------------------------------------------

// 2. método para listar os alunos cadastrados
// método público estático que vai me devolver um objeto do tipo lista (a lista que está no repository)

public List<Aluno> listarAlunos() {
        
    List<Aluno> copiaDaLista = new ArrayList<>();

    for (int i = 0; i < AlunoRepository.armazem.size(); i++) {

			Aluno alunoOriginal = AlunoRepository.armazem.get(i);

            Aluno AlunoCopia = new Aluno ();

            AlunoCopia.setNome(alunoOriginal.getNome());
            AlunoCopia.setIdade(alunoOriginal.getIdade());
            AlunoCopia.setTurma(alunoOriginal.getTurma());
            AlunoCopia.setTelefone(alunoOriginal.getTelefone());
            AlunoCopia.setNascimento(alunoOriginal.getNascimento());

            copiaDaLista.add(AlunoCopia);

		}

        return copiaDaLista;
    
}
//-------------------------------------------------------------------------------

// 3. método para buscar aluno por nome

public Aluno buscarAluno (String nomeParaBuscar){

for (int i=0; i<AlunoRepository.armazem.size(); i++){

    Aluno alunoOriginal = AlunoRepository.armazem.get(i); 

    if (alunoOriginal.getNome().equalsIgnoreCase(nomeParaBuscar)){

        Aluno alunoCopia  = new Aluno ();
       
        alunoCopia.setNome(alunoOriginal.getNome());
        alunoCopia.setIdade(alunoOriginal.getIdade());
        alunoCopia.setTurma(alunoOriginal.getTurma());
        alunoCopia.setTelefone(alunoOriginal.getTelefone());
        alunoCopia.setNascimento(alunoOriginal.getNascimento());

        return alunoCopia;
    
    }
}
return null;
}

//-------------------------------------------------------------------------------

// 4. método para deletar o nome de um aluno
// método público estático que vai me devolver um objeto do tipo String

public String deletar (String nomeParaDeletar){

// vou percorrer a lista armazem. 
for (int i=0; i<AlunoRepository.armazem.size(); i++) {

    // pegar os dados do aluno 
    Aluno aluno = AlunoRepository.armazem.get(i);

    // se o nomeparaDeletar for igual ao nome que está guardado e uma das posições: 
    if (aluno.getNome().equalsIgnoreCase(nomeParaDeletar)) {

        //será deletado.
        AlunoRepository.armazem.remove(i);

        // informa que o nome foi deletado.
        return nomeParaDeletar;
       
    }
}
return "Aluno não encontrado";
}

//-------------------------------------------------------------------------------

}






