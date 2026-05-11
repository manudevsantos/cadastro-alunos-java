// packcage model - Funciona como um "molde" para captar as propriedades dO Objeto em questão, nessa caso: do aluno.
//--------------------------------------------
package src.model;

public class Aluno {

// propriedades declaradas:
//--------------------------------------------

private final int ID;
private String nome;
private int idade;
private String turma;
private String telefone;
private String nascimento;

private static int contador = 0;
	
public Aluno() {
	this.ID = ++contador;
}

// getters e setters - Método usado para manipular as propriedades declaradas.
//--------------------------------------------

public void setNome (String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}
//--------------------------------------------

public void setIdade (int idade){
    this.idade = idade;
}

public int getIdade(){
    return idade;
}
//--------------------------------------------

public void setTurma (String turma){
    this.turma = turma;
}

public String getTurma(){

    return turma;
}
//--------------------------------------------

public void setTelefone (String telefone) {
    this.telefone = telefone;
}

public String getTelefone() {
    return telefone;
}
//--------------------------------------------

public void setNascimento (String nascimento) {
    this.nascimento = nascimento;
}

public String getNascimento() {
    return nascimento;
}

public int getID() {
	return ID;
}

//--------------------------------------------


// Override é um comando que serve para trocar o to String padrão do java pelo meu método que mostra nome, idade, tur, etc...
@Override


//to String é a mensagem que vai aparecer
public String toString() {

    return "\n ID: " + ID + "\n Nome: " + nome + "\n Idade: " + idade + "\n Turma: " + turma + " \n Telefone: " + telefone + "\n Data de nascimento: " + nascimento;
}

}