## Biblioteca

### 1. Objetivo
Neste trabalho, o aluno projetará e implementar um sistema de porte muito pequeno. O objetivo é permitir que os alunos usem seus conhecimentos em projeto orientado a objetos e programação orientada a objetos.

### 2. Visão Geral do Sistema
O sistema de biblioteca consiste no gerenciamento e manutenção de livros disponíveis em uma biblioteca acadêmica. Ele permite que três tipos de usuários (alunos de graduação, alunos de pós-graduação e professores) realizem o empréstimo, devolução e reserva de livros disponíveis. Um livro específico pode dispor na biblioteca de mais de um exemplar. Assim, é possível encontrar na biblioteca dois ou mais exemplares de um mesmo livro.

Cada livro deve possuir um código que o identifique e um título. Além do código e do título, os livros devem manter as seguintes informações adicionais: editora, autores, edição e ano da publicação. Cada usuário deve ter um código de identificação e nome. Cada um dos três tipos de usuários possui regras específicas para poder pegar livro emprestado. Essas regras são detalhadas na descrição da funcionalidade de empréstimo, na Seção 3 deste documento. Além disso, a cada tipo de usuário é permitido um determinado intervalo de tempo, em dias, durante o qual ele pode ficar com o livro emprestado, conforme a Tabela 1. Sempre que o empréstimo de um livro é solicitado na biblioteca, é feito o registro daquela operação no sistema e é fixada uma data de devolução baseada no tempo de empréstimo do tipo de usuário.

| Tipo de Usuário   | Tempo de Empréstimo |
| ------------- | ------------- |
| Aluno Graduação   | 3 dias  |
| Aluno Pós-Graduação  | 4 dias  |
| Professor | 7 dias |

Usuários têm também o direito de realizar reservas de livros. A reserva de um livro garante a prioridade no seu empréstimo apenas entre os alunos. A reserva também tem que ser registrada no sistema.
