
package crudoperationdBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.genericutilities.javalibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Createproj 
{
	@Test
	public void create1()
	{	baseURI="http://rmgtestingserver";
		port=8084;
		javalibrary jlib=new javalibrary();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","kala");
		jobj.put("projectName", "shin"+jlib.random());
		jobj.put("status", "created");
		jobj.put("teamSize", 4);
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat()
		.statusCode(201)
		.contentType(ContentType.JSON)
		.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
		
		
		
		
		
		
	}
		
	
	
	
	

}
