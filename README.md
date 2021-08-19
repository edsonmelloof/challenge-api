<h1 align="center">Sys Manager / Challege-Api</h1>

<img src="https://www.cqcs.com.br/wp-content/uploads/2019/06/Challenge.arrow_-1024x584.jpg" />

<p align="center">
The application purpose is to make easy to consume API from services related to PagSeguro by the Xangai team, that is, the data consumption use has one exclusive purpose: troubleshooting PROD problems. </br>
</p>


# Sumário
* [Requisitos de Instalação](#Requisitos-de-Instalação)
* [Testes](#Testes)
* [Sonarqube](#Sonarqube)

# Requisitos de Instalação
<ul>
<li>JAVA 15</li>
<li>Plugin Lombok</li>
<li>Maven</li>
<li>Docker</li>
<li>Imagem docker do Sonarqube</li>
</ul>


# Run

<ul>
    <li>Rodar o Projeto</li>
    <li>Entrar no repositório via terminal e executar o comando: mvn spring-boot:run</li>
    <li>url de acesso do swagger: localhost:8081/swagger.html</li>

</ul>

# Testes

<ul>
    <li>mvn clean verify</li>
    <li>url de acesso do jacoco reports: http://localhost:63342/challenge-api/target/site/jacoco/index.html</li>
</ul>

# Sonarqube

<ul>  
    <li>Subir o container sonarqube pelo comando: sudo docker start sonarqube</li>
    <li>rodar o comando: mvn sonar:sonar</li>
    <li>link local sonarqube: localhost:9000</li>
</ul>
