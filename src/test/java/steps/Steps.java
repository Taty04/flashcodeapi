package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {
	
	Metodos m = new Metodos();

	@Given("retornar a consulta {string}")
	public void retornar_a_consulta(String string) {
		m.GetCepValido(string);
	    
	}

	@When("retornar a consulta")
	public void retornar_a_consulta() {
	   
	}

	@Then("sera exibido as informacoes do cep")
	public void sera_exibido_as_informacoes_do_cep() {
	    
	}
	
	
	
}
