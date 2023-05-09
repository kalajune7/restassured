package crudoperationswithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateproj
{
	@Test
	public void update()
	{
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy","kala");
		jobj.put("projectName", "shin");
		jobj.put("status", "created");
		jobj.put("teamSize", 4);
		RequestSpecification req=RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response response = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_5072");
		System.out.println(response.asPrettyString());
		
		
	}

}
