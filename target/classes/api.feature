@tag
Feature: Title of your feature
I want to use this template for my feature file




@tag2
Scenario Outline: servico de consulta de cep
Given retornar a consulta "<cep>"
When retornar a consulta
Then sera exibido as informacoes do cep



Examples:
| cep |
|47807012 |
|47800-145|
|47800-632|