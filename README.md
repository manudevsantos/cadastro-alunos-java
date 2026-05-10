# cadastro-alunos-java

Sistema de gerenciamento de alunos em Java, desenvolvido para fins acadêmicos, aplicando conceitos de POO, encapsulamento e segurança de dados.

## 📂 Classes do Projeto

- **model/ Aluno:** Classe de modelo com os atributos, construtores, getters e setters.
- **repository/ AlunoRepository:** Responsável pelo armazenamento dos dados (armazém). 
- **service/ AlunoService:** Camada de lógica responsável pelos métodos utilizados na aplicação. 
- **controller/ AlunoController:** Gerencia a comunicação entre o menu e os serviços. 
- **menu/ Menu:** Interface de console com a lista de serviços disponíveis para o usuário.
- **Main:** Classe principal que executa o sistema e o tratamento de erros.

## 🛡️ Proteção e Segurança de Dados

Para garantir a integridade do sistema, foram aplicados dois níveis de proteção:

1. **CÓPIA DA LISTA:** O sistema gera uma nova lista independente para que o repositório original não seja exposto diretamente.
2. **CÓPIA DO OBJETO:** Utilizei o comando `new Aluno()` para criar cópias físicas de cada aluno na listagem e na busca. Isso garante que qualquer alteração feita nos dados retornados não afete o objeto original guardado no sistema.

## ✨ Funcionalidades e Diferenciais

- **ID Automático:** Gerado automaticamente através de membros estáticos na classe Aluno.
- **Tratamento de Erros:** Implementação de `try-catch` no menu para evitar que o programa feche caso o usuário digite letras onde o sistema espera números.
- **Arquitetura Organizada:** Divisão clara de responsabilidades entre as classes.

---
**Desenvolvido por Manuella Santos.**
