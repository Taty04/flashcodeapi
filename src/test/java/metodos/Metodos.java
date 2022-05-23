package metodos;



import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;



public class Metodos {



private String url;
private Response response;



public void setUrl(String url) {
this.url = url;

}

public void GetCepValido (String cep) {

response = RestAssured.request(Method.GET,"https://viacep.com.br/ws/"+cep+"/json/");
System.out.println(response.getBody().asString());


}
public void ConsultaCep() {
	
	System.out.println("Retorno do status code : " + response.statusCode()+response.getBody().asString());
	
	
	
}


}
