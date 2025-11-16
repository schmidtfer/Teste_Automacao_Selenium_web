# Projeto de automação de teste web com Selenium Webdriver + Java.

Este projeto automatiza o teste da funcionalidade de receber um cupom de desconto no site da Qazando, com objetivo de validar o fluxo 
onde o usuário preenche o e-mail, clica em "ganhar cupom" e visualiza o código de desconto.    

# Base url:
    https://qazando.com.br/curso.html

# Insiro os webdrives: 
    -> Chrome
    -> Firefox

# Dentro de teste crio a pasta Resource:
    --> arquivo feature onde fica o Gherkin BDD

# Dentro de Java crio a pasta Runner:
    --> classe executora do teste (Cucumber.class)
    --> Dentro desta pasta passo também meu path para criar os reports, dentro de plugins.
    --> Reports: cria em Json e em HTML.

# Pasta features
     --> BDD em Gherkin

#  Java ->  pasta Steps:
    -> onde estarão os steps do BDD

# Pasta page (contém page objects)
    -> as ações. Ajuda no reaproveitamento de código, organização e facilita a manutenção.

# System.out.println(""");  console

# JUnit 
 -> responsável pelos asserts

# Maven: utilizado para realizar o gerenciamento das depedências do projeto
pom.xml é onde ficam as dependências

# Rodo testes no IntelliJ