# Projeto Loja De Departamento

Este é um projeto de exemplo de uma api para uma loja virtual desenvolvido em Java utilizando Spring Boot.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.0.4
- Spring Data JPA
- MySQL Driver
- Flyway Migration
- Validation
- Lombok
- Maven

## Configurações

Para executar o projeto é necessário ter o MySQL instalado e configurar o arquivo application.properties com as informações de conexão com o banco de dados:

<pre>
spring.datasource.url=jdbc:mysql://localhost:3306/loja
spring.datasource.username=root
spring.datasource.password=123456
</pre>




Além disso, é necessário ter uma base de dados criada com o nome "loja".

## Como Executar

Para executar o projeto, basta abrir o terminal na pasta raiz do projeto e digitar o seguinte comando:

<pre>
mvn spring-boot:run
</pre>



Após executar o comando, o projeto estará disponível no endereço http://localhost:8080.

## Documentação da API

A documentação da API está disponível em formato Swagger, no endereço http://localhost:8080/swagger-ui.html.

## Autor

Glauber Balsani



