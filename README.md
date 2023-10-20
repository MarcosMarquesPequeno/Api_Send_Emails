# Api Envio de Emails
  Consite um micro serviço de Envio de emails utlizando o AWS SES (Amazon Simple Email Service), utlizando o metodo de arquitetura limpa:
  packge core - onde reuni as regras de negocio, exceções e os casos de uso;

  packge aplication - conecta o core com mundo externo como uma ponte, irá implementar o core da aplicação;

  packge adapters - adapta o mundo de fora para uma interface e a plicação irá depender da interface fazendo com que não dependa apenas do AWS SES podendo usar outros serviços de email;

  packge infa - responsável pela interação de servicos externos dentro dela tem  packege ses contem as configuraçõesda Api AWS SES, 
  dentro do packge infra e possivel adaptar outros Api criando um novo packge com o nome da Api desejada ou outro micro services;

  packge controller - Recebe requisições Http e realiza as chamada de todos os packges;

  Por fim configurar o aplication.properties com as chaves de acesso ao SDK AWS SES;




## Funções Usuarios

- [X] Enviar Emails

| Método HTTP	| Endpoint | Descrição |
|--------|----------|----------|
| POST |	/api/email |	Enviar email |
