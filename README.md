# App_peixonauta_PAM
Desenvolvedores: Paulo Ricardo Matiasso Cruz e Rebeka Lima Amorim – 2° M-TEC PI Desenvolvimento de Sistemas (DS)

Projeto PAM – Aplicativo Mobile

### Sobre o aplicativo:

O aplicativo "Peixonauta (Novas Missões do Peixonauta)" é tematizado com os personagens do desenho animado: Peixonauta e seus amigos. A princípio, o assunto abordado é o consumo consciente da água. Sendo assim, as suas principais funcionalidades é uma história em quadrinhos com áudio (HQ) e uma tela para cálculo de consumo de água (chuveiro/banho e torneira).

### Descrição do Aplicativo:
#### 1. Tela Inicial (Login)
A tela inicial do aplicativo vai ser composta pelo nome do usuário, senha para o usuário preencher, além de ter um botão, com opção de Entrar. A partir disso, o usuário terá a possibilidade de acessar a tela cadastro/perfil.

#### 2. Tela Cadastro/Perfil 
A tela perfil vai ser utilizada pelos usuários que estão acessando o aplicativo pela primeira vez, logo vai aparecer nessa tela os dados preenchidos na tela incial, além de ter a opção de escrever um texto para sua bio. Por meio disso, haverá um botão, um com opção do cliente "confirmar" os dados apresentados no aplicativo e um outro (ImageButton) para voltar a tela inicial (login), caso queria alterar algum dado errado.

#### 3. Tela Menu
Depois do usuário estar logado, ele terá acesso ao conteúdo do aplicativo, composto pela história do Peixonauta sobre o consumo de água consciente e opção de calcular o consumo de água do usuário ao utilizar o chuveiro ou a torneira.

##### 3.1 Sensor de Acelerômetro com áudio 
Além disso, na Tela Menu, o usuário terá a possibilidade de utilizar o sensor de acelerômetro com o aúdio/música da abertura do Peixonauta. Dessa forma, o usuário, primeiramente, terá que balançar o celular e, com isso, a música do Peixonauta será ativada e também terá a possibilidade de pausar a música e retormar novamente a música.

#### 4. Tela História
Após o usuário clicar na opção de historinha da tela de menu, ele será direcionado a tela de história em áudio. Nessa tela, usaremos ImageButton, dessa forma, quando o usuário clicar, emitirá o som de uma parte da história. Além desse Imagebutton, terá 3 botões, com a funcionalidade de voltar a tela anterior, pausar o áudio, e seguir para a próxima tela, respectivamente.

#### 5. Tela Curiosidades
Quando o usuário clicar na seta direita, ele irá acessar a tela de "Você Sabia?", onde possui 3 curiosidades sobre o tema referido na história. Usaremos o TextView para o conteúdo, e a Imageview para a imagem de fundo. Também nele haverá um Button que encaminha para próxima e última tela sobre a historinha.

#### 6. Tela Dicas
Nesta tela, será abordado três dicas referente a história escutada (que neste caso é o consumo de água), dando dicas de como fazer o bom uso da água e poupando-a. Ela seguirá um padrão semelhante ao da tela curiosidades, com a ImageView de fundo, TextView para o título da página e dicas, e um Button para voltar para a tela de Menu.
 
#### 7. Tela Consumo (chuveiro e torneira)
Nesta tela, será abordado uma interatividade, no qual o usuário terá que calcular o seu consumo de água no banho e também em uma torneira, ou seja, terá a opção de analisar e saber o consumo de água de seu chuveiro e torneira durante um determinado período ou dias gastado, e ao finalizar, terá uma breve mensagem se está economizando ou gastando muita água durante esse processo.

Obs.: Vale ressaltar que terá a possibilidade de alternância entre um tipo de cálculo, ou seja, entre o cálculo do chuveiro e da torneira nessa mesma tela apresentada.

### Diagrama de Classes 

![DIAGRAMA_APP](https://github.com/rebekaamorim/App_peixonauta_PAM/assets/127450671/44e0ce71-370f-4d6b-bc65-a8c5b30094d4)

#### Descrição e explicação do diagrama

##### Este diagrama é composto por 3 classes:
- Usuario: é composto pelos atributos "usuario" e "senha", ambos são do tipo string. O método dessa classe é "entrar", pois ela representa a tela de login para acessar o aplicativo.
- Cadastro: essa classe é composta pelos atributos "nome_usuario", "senha", "foto" e "descricao". Todas elas recebem dados do tipo string, menos o atributo foto, no qual recebe o tipo _img_. Seus métodos são cadastrar e atualizar, já que o usuario pode colocar seus dados, e se quiser modificá-los depois.
- Consumo: Essa classe é composta pelos atributos "minutos" do tipo double, e "periodo_dias" do tipo int. Eles representam, respectivamente, os minutos que o usuário passa com o chuveiro ou a torneira ligada e o período de dias que o usuario que descobrir o seu gasto total. Obviamente, seu método é calcular.

##### Multiplicidade e relacionamentos

A classe "Usuario" e "Cadastro" possuem um relacionamento de composição, pois elas são inseparáveis. O usuário precisa se cadastrar para entrar com o login, e o login precisa das informações do castrado para ser validado. A multiplicidade entre eles é de 1 para 1, pois apenas um login pode ter um cadastro e vice-versa.

A classe "Usuario" e "Consumo" possuem um relacionamento de dependência, pois, como o próprio nome diz, para o usuário calcular seu consumo ele precisa estar logado, ou seja, depende do login. A multiplicidade entre eles é de 0 para muitos, visto que não necessariamente o usuário precisa ter um consumo ou ele pode ter muitos consumos.

Obs.: Todos os atributos e métodos são privados. 

### VÍDEO DO FUNCIONAMENTO

https://youtu.be/7Zj0XQtEmT4?feature=shared

### VÍDEO DO FUNCIONAMENTO COM O SENSOR DE ACELERÔMETRO COM AÚDIO 1

https://youtube.com/shorts/3qDhf2qoyfs?feature=share

### VÍDEO DO FUNCIONAMENTO COM O SENSOR DE ACELERÔMETRO COM ÁUDIO 2

https://youtu.be/yzwOlJ-PyLQ