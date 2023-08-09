# App_peixonauta_PAM
Desenvolvedores: Paulo Ricardo Matiasso Cruz e Rebeka Lima Amorim – 2° M-TEC PI Desenvolvimento de Sistemas (DS)

Projeto PAM – Aplicativo Mobile

### Sobre o aplicativo:

O aplicativo "Peixonauta" é tematizado com os personagens do desenho animado: Peixonauta. A princípio, o assunto abordado é o consumo consciente da água. Sendo assim, as suas principais funcionalidades é uma história em quadrinhos com áudio (HQ) e uma tela para cálculo de consumo de água (chuveiro/banho e torneira).

### Descrição do Aplicativo:
#### 1. Tela Inicial (Login)
A tela inicial do aplicativo vai ser composta por dois botões, um com opção de Login e o outro de Cadastro (primeiro acesso). A partir disso, o usuário terá a possibilidade de acessar as demais telas.

#### 2. Tela Cadastro (Primeiro Acesso)
A tela cadastro vai ser utilizada pelos usuários que estão acessando o aplicativo pela primeira vez, logo vai ser composta pelo nome do usuário, senha, foto e descrição/biografia para o usuário preencher. Por meio disso, haverá dois botões, um com opção de cadastrar o cliente no aplicativo e o outro para voltar a tela inicial (login).

#### 3. Tela Menu
Depois do usuário estar logado, ele terá acesso ao conteúdo do aplicativo, composto pela história do Peixonauta sobre o consumo de água consciente e opção de calcular o consumo de água do usuário ao utilizar o chuveiro ou a torneira.

#### 4. Tela História
Após o usuário clicar na opção de historinha da tela de menu, ele será direcionado a tela de história em áudio. Nessa tela, usaremos ImageButton, dessa forma, quando o usuário clicar, emitirá o som de uma parte da história. Além desse Imagebutton, terá 3 botões, com a funcionalidade de voltar a tela anterior, pausar o áudio, e seguir para a próxima tela, respectivamente.

#### 5. Tela Curiosidades
Quando o usuário clicar na seta direita, ele irá acessar a tela de "Você Sabia?", onde possui 3 curiosidades sobre o tema referido na história. Usaremos o TextView para o conteúdo, e a Imageview para a imagem de fundo. Também nele haverá um Button que encaminha para próxima e última tela sobre a historinha.

#### 6. Tela Dicas
Nesta tela, será abordado três dicas referente a história escutada (que neste caso é o consumo de água), dando dicas de como fazer o bom uso da água e poupando-a. Ela seguirá um padrão semelhante ao da tela curiosidades, com a ImageView de fundo, TextView para o título da página e dicas, e um Button para voltar para a tela de Menu.
 
#### 7. Tela Consumo (chuveiro e torneira)
Nesta tela, será abordado uma interatividade, no qual o usuário terá que calcular o seu consumo de água no banho e também em uma torneira, ou seja, terá a opção de analisar e saber o consumo de água de seu chuveiro e torneira durante um determinado período ou dias gastado, e ao finalizar, terá uma breve mensagem se está economizando ou gastando muita água durante esse processo.

Obs.: Vale ressaltar que terá a possibilidade de alternância entre um tipo de cálculo, ou seja, entre o cálculo do chuveiro e da torneira nessa mesma tela apresentada.
