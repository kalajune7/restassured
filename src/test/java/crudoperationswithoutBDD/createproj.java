package crudoperationswithoutBDD;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import com.genericutilities.javalibrary;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createproj

{
	
@Test
public void create() 
{	
	//1.prerequisites
	javalibrary jlib=new javalibrary();
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","kala");
	jobj.put("projectName", "shin"+jlib.random());
	jobj.put("status", "created");
	jobj.put("teamSize", 4);
	
	RequestSpecification req=RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	
	//2perform the action
	
	Response response = req.post("http://rmgtestingserver:8084/addProject");
	
	
	//provide validation
	
	
	System.out.println(response.statusCode());
	System.out.println(response.getContentType());
	System.out.println(response.asString());
	System.out.println(response.asPrettyString());
	System.out.println(response.getTime());
	
	
	
	
	
}
}
