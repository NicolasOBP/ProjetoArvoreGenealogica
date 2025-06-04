🌳 Projeto Árvore Genealógica
Este é um projeto em Java desenvolvido como parte da disciplina de Estrutura de Dados na faculdade. O objetivo principal é implementar e manipular uma árvore genealógica, permitindo o cadastro, organização e visualização das relações familiares entre pessoas.

📚 Descrição Geral
O sistema representa uma árvore genealógica, onde cada nó é uma pessoa e seus descendentes são armazenados como filhos. O projeto foi organizado em 6 classes principais, cada uma com responsabilidades bem definidas, visando boas práticas de programação orientada a objetos e aplicação de estruturas de dados estudadas na disciplina.

🧩 Estrutura do Projeto

1. App.java
   Arquivo principal que contém o método main. Ele é responsável por iniciar o programa e controlar o fluxo principal da aplicação, fazendo chamadas para outras classes como Entradas e Arvore.

2. Arvore.java
   Classe responsável por armazenar e manipular a árvore genealógica como um todo. Fornece métodos para adicionar membros, buscar pessoas, imprimir a árvore, entre outras funcionalidades.

Estrutura de Dados: A árvore é construída com nós encadeados, permitindo múltiplos filhos para cada nó (representando descendência).

3. Entradas.java
   Classe responsável por lidar com a entrada de dados do usuário, como cadastro de novas pessoas, definição de parentescos e chamadas às operações disponíveis na árvore.

4. Lista.java
   Implementa uma lista encadeada personalizada para armazenar os filhos de um nó da árvore. Cada elemento da lista representa um descendente direto de uma pessoa.

Estrutura de Dados: Lista ligada (simplesmente encadeada), implementada manualmente sem uso de coleções prontas.

5. No.java
   Classe que representa um nó da árvore genealógica. Cada nó contém uma instância da classe Pessoa e uma Lista com os seus filhos.

6. Pessoa.java
   Classe que armazena os dados de uma pessoa, como nome, data de nascimento, e possivelmente outras informações pessoais relevantes.

⚙️ Estruturas de Dados Utilizadas
Árvore Generalizada: Estrutura principal que representa as relações de ancestralidade.

Lista Encadeada: Implementada manualmente para armazenar os filhos de cada nó da árvore.

Nós Personalizados: Cada nó contém dados de uma pessoa e a lista de seus filhos, simulando uma árvore genealógica multi-nível.

🎓 Projeto Acadêmico
Este projeto foi desenvolvido como trabalho da disciplina de Estrutura de Dados, com o objetivo de aplicar na prática conceitos como árvores, listas encadeadas, encapsulamento e modularização de código em Java.

🚀 Como Executar
Compile todos os arquivos .java com um compilador Java (como o javac).

Execute a classe principal App.java.

Siga as instruções no terminal para adicionar pessoas e explorar a árvore genealógica.

✍️ Autor
Desenvolvido por Nícolas Oliveira Baptista Pereira – Estudante de Análise e Desenvolvimento de Sistemas na Fatec Bragança Paulista.
