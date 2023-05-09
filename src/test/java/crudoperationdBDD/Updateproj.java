package crudoperationdBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.genericutilities.javalibrary;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Updateproj 
{
	@Test
	public void update()
	{ 	baseURI="http://rmgtestingserver";
		port=8084;
		javalibrary jlib=new javalibrary();
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","kala");
		jobj.put("projectName", "shin"+jlib.random());
		jobj.put("status", "created");
		jobj.put("teamSize", 7);
		
		
		given().body(jobj).contentType(ContentType.JSON)
		.when().put("/projects/TY_PROJ_5203")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}

}
