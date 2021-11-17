package tugas5.SignUp;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import tugas5.SignUp.RequestDataFaker;

public class SignUp {
RequestDataFaker requestDataFaker = new RequestDataFaker();
	
	@Test
	public void SignUp() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		String payload = "{\"user\": {\"email\": \""+requestDataFaker.requestEmail()+"\",\"first_name\": \""+requestDataFaker.requestFirstname()+"\",\"last_name\" : \""+requestDataFaker.requestLastname()+"\",\"phone_number\": \"+62-"+requestDataFaker.requestPhoneNumber()+"\",\"password\": \""+requestDataFaker.requestPhoneNumber()+"\"}}";
		Response response = RestAssured.given().contentType("application/json").body(payload).when().post("/users");
		assertEquals(response.getStatusCode(),200);
	}
}
