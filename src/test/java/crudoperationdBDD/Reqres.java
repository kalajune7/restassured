package crudoperationdBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Reqres 
{
	@Test
	public void req() {
		baseURI="https://reqres.in/";
		
		
		JSONObject jobj=new JSONObject();
		jobj.put("name", "kala55");
		jobj.put("job","software");
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("api/users")
		.then().assertThat().statusCode(201).log().all();
		
	}

}
