
@tag
Feature: servico de consulta de cep
@tag1
Scenario Outline: Consulta Cep Valido
Given retornar a consulta "<cep>"
When retornar a consulta
Then sera exibido as informacoes do cep



Examples: 

|cep|
|44890000|
|44900000|
