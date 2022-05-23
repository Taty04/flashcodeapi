
@tag
Feature: servico de consulta de cep
@tag1
Scenario Outline: Consulta Cep Valido
Given retornar a consulta "<cep>"
When retornar a consulta
Then sera exibido as informacoes do cep



Examples: 

|cep|
|448900001|
|44900000|
