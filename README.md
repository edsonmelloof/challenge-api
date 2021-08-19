<h1 align="center">Sys Manager / Challenge-Api</h1>

<img src="https://www.cqcs.com.br/wp-content/uploads/2019/06/Challenge.arrow_-1024x584.jpg" />

<p align="center">
The purpose of the application is to facilitate the demonstration of knowledge in a Java Rest application. </br>
</p>


# Summary
* [Installation_Requirements](#Installation-Requirements)
* [Tests](#Tests)
* [Sonarqube](#Sonarqube)

# Installation Requirements
<ul>
<li>JAVA 15</li>
<li>Plugin Lombok</li>
<li>Maven</li>
<li>Docker</li>
<li>Sonarqube docker image</li>
</ul>


# Run

<ul>
    <li>Run the Project</li>
    <li>Access the project directory via terminal and execute the command: mvn spring-boot:run</li>
    <li>URL to access swagger: localhost:8081/swagger.html</li>
</ul>

# Tests

<ul>
    <li>mvn clean verify</li>
    <li>URL to access jacoco reports: http://localhost:63342/challenge-api/target/site/jacoco/index.html</li>
</ul>

# Sonarqube

<ul>  
    <li>Raise the sonarqube container by command: sudo docker start sonarqube</li>
    <li>Execute command: mvn sonar:sonar</li>
    <li>Sonarqube local link: localhost:9000</li>
</ul>
