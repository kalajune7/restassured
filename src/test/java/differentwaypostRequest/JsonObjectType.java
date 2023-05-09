package differentwaypostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.genericutilities.javalibrary;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class JsonObjectType 
{
	@Test
	public void jsonobject() {
		JSONObject jobj= new JSONObject();
		javalibrary jlib=new javalibrary();
		baseURI="http://rmgtestingserver";
		port=8084;
		jobj.put("createdBy","kala");
		jobj.put("projectName", "shin"+jlib.random());
		jobj.put("status", "created");
		jobj.put("teamSize", 4);	
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
		
	
	
	
	}
	

}
