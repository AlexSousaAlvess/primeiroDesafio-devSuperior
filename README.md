<h1>primeiro Desafio do bootcamp dev superior</h1>

<h2>Desafio do capítulo 1: Backend parte 1</h2>

<p>Trabalho final do capítulo
Enunciado do trabalho
Você deverá entregar um projeto Spring Boot 2.3.x contendo um CRUD completo de web
services REST para acessar um recurso de clientes, contendo as cinco operações básicas
aprendidas no capítulo:</p>
<ul>
  <li>Busca paginada de recursos</li>
  <li>Busca de recurso por id</li>
  <li>Inserir novo recurso</li>
  <li>Atualizar recurso</li>
  <li>Deletar recurso</li>
</ul>
<p>O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados
H2, deverá usar Maven como gerenciador de dependência, Java 11 como l inguagem.
Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A
especificação da entidade Client é mostrada a seguir (você deve sequir à risca os nomes de
classe e atributos mostrados no diagrama):
</p>

![11](https://user-images.githubusercontent.com/8229999/98680365-11e48480-2340-11eb-8c34-44b86378bb93.PNG)

<p>Endpoints da api</p>
<ul>
  <li>ListClients [GET]: https://teste01-ds-client.herokuapp.com/clients</li>
  <li>Clients by ID [GET]: https://teste01-ds-client.herokuapp.com/clients/1</li>
  <li>New Client [POST]: https://teste01-ds-client.herokuapp.com/clients</li>
  <li>Update Client [PUT]: https://teste01-ds-client.herokuapp.com/clients/1</li>
  <li>Delete Client [DELETE]: https://teste01-ds-client.herokuapp.com/clients/1</li>
</ul>
