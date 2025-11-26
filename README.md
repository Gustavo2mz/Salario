📋 Sistema de Gerenciamento de Funcionários

Este é um projeto prático desenvolvido em Java, focado na aplicação dos conceitos fundamentais de Programação Orientada a Objetos (POO) e manipulação de estruturas de dados em memória (ArrayList).

O objetivo principal foi criar uma aplicação de console para gerenciar aumentos salariais de funcionários baseados em seus IDs.

🚀 Funcionalidades

    Cadastro Dinâmico: O usuário define quantos funcionários serão registrados.

    Armazenamento de Dados: Utilização de ArrayList para manter os objetos em memória.

    Busca Eficiente: Algoritmo de busca para localizar um funcionário específico através do seu ID.

    Lógica de Negócios: Cálculo de aumento salarial baseado em porcentagem, atualizando o atributo do objeto encontrado.

    Feedback Visual: Listagem final com os dados atualizados de todos os registros.

🛠️ Tecnologias e Conceitos Utilizados

    Java (JDK)

    POO (Programação Orientada a Objetos):

        Classes e Objetos

        Encapsulamento

        Métodos e Atributos

    Collections Framework: Manipulação de List e ArrayList.

    Entrada de Dados: Classe Scanner.

    Estrutura de Pacotes: Organização do código (ex: pacote entities).

⚙️ Como o Projeto Funciona

    O programa solicita a quantidade de funcionários a serem cadastrados.

    Para cada funcionário, o sistema lê:

        ID (Identificador único)

        Nome

        Salário

    Os dados são instanciados como objetos da classe Clientes e armazenados em uma lista.

    O sistema solicita o ID do funcionário que receberá o aumento.

        Se o ID existir: O programa pede a porcentagem e atualiza o salário.

        Se o ID não existir: O programa aborta a operação de aumento (ou exibe mensagem de erro).

    Ao final, a lista completa de funcionários é exibida.

📂 Estrutura do Projeto

O código foi organizado para separar a lógica de execução da regra de negócio:
Bash

src
├── application
│   └── Program.java      # Classe principal com método main e lógica de interação
└── entities
    └── Clientes.java     # Classe que representa o objeto Funcionário (atributos e métodos)

💻 Exemplo de Uso

Plaintext

Quantos funcionários você vai registrar? 2

Funcionário #1:
Id: 333
Nome: Maria Brown
Salario: 4000.00

Funcionário #2:
Id: 536
Nome: Alex Grey
Salario: 3000.00

Entre com o ID do funcionário que terá aumento salarial: 536
Entre com a porcentagem: 10.0

Lista de funcionários:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00

🎯 Aprendizados

Durante o desenvolvimento deste projeto, pratiquei:

    [x] Estruturação de código limpo em Java.

    [x] Organização de classes em pacotes (entities).

    [x] Leitura e validação de dados via console.

    [x] Lógica de busca e filtragem dentro de listas.

    [x] Aplicação de regras de negócio (cálculo de porcentagem) diretamente nos objetos.

Desenvolvido para fins de estudo e prática de Java.

Dica Extra para o seu código:

Notei que você mencionou que a classe se chama Clientes, mas o contexto é de "funcionários" (salário, aumento). Em um cenário real ou para melhorar seu portfólio, seria interessante renomear a classe Clientes para Funcionario ou Employee. Isso deixa o código semanticamente mais correto (Refactoring).
