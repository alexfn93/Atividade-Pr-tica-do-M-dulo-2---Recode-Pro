Algoritmo "Exercício individual Recode"
//
//

// Exercício:

//Usando Pseudocódigo:

//Use conceitos de programação estruturada (Vetor), criar em pseudocódigo
//um menu para simular um cadastro para uma agência de viagens com as seguintes
//funções: cadastro de cliente e cadastro de destino, criar também uma consulta
//para cada estrutura de dados.


// Autor(a)    : Alex Fernandes Nunes
// Data atual  : 26/06/2022


Var
    cadastro: vetor[1..3, 1..10] de caractere // Uma matriz que irá funcionar como uma tabela de cadastro de clientes
    dados: vetor[1..10] de caractere //um vetor que armazenará as perguntas para colher as informações dos clientes
    cliente: inteiro //armazena valor no vetor "cadastro"
    infomacoes: inteiro //armazena valor no vetor "cadastro"
    n: inteiro // faz parte da função lógica de "i" para busca de cadastro por cpf
    cpf: caractere // faz parte da funçao "procedimento" para buscar um cadastro pelo cpf
    opcaoEscolhida: inteiro // armazena a opção de ação escolhida
    i: logico //
    cadastraCliente: inteiro //auxilia a na escolha do "MENU DE OPÇÕES"
    localizaCliente: inteiro//auxilia a na escolha do "MENU DE OPÇÕES"
    


procedimento consultarCliente(buscarCpf: caractere)
 inicio
   para cliente de 1 ate 3 passo 1 faca
     se(buscarCpf = cadastro[cliente, 3]) entao
       para infomacoes de 1 ate 10 passo 1 faca
         escreval(dados[infomacoes], cadastro[cliente, infomacoes])
       fimpara
     fimse
   fimpara
fimprocedimento


//Formulário para o cliente preencher para criar um banco de dados
Inicio

dados[1] <- "Digite seu nome completo: "
dados[2] <- "Digite sua data de nascimento: "
dados[3] <- "Digite seu CPF: "
dados[4] <- "Digite seu gênero (M,F ou O): "
dados[5] <- "Digite seu endereço: "
dados[6] <- "Digite seu e-mail: "
dados[7] <- "Digite seu local de origem: "
dados[8] <- "Digite seu local de destino: "
dados[9] <- "Digite sua data de ida: "
dados[10]<- "Digite sua data de volta: "




//inserir os dados dos clientes novos
escreval ("----------------PREENCHA SUAS INFORMAÇÕES------------")
escreval()
para cliente de 1 ate 3 passo 1 faca
  para infomacoes de 1 ate 10 passo 1 faca
    escreva(dados[infomacoes])
    leia(cadastro[cliente, infomacoes])
  fimpara
  escreval()
     escreval("-------------------NOVO CADASTRO---------------------")
  escreval()
fimpara

//imprime os dados dos cliente
      escreval ("------BANCO DE DADOS DO CADASTRO DOS CLIENTES---------")
      escreval()
para cliente de 1 ate 3 passo 1 faca
  para infomacoes de 1 ate 10 passo 1 faca
    escreval(cadastro[cliente, infomacoes])
  fimpara
  escreval("--------------Cliente-----------")
  escreval()
fimpara



escreval("----- LOCALIZA OS DADOS DO CLIENTE POR CPF -----")
escreval()
escreva("Informe o CPF para buscar dados do cliente: ")
leia(cpf)
escreval()
se i=cpf entao
consultarCliente(cpf)
se i=n entao
escreval("CPF não localizado, cadastro inexistente!")
fimse
fimse
Fimalgoritmo

