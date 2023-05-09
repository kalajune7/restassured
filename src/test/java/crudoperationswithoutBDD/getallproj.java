package crudoperationswithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getallproj {
@Test
public void getall() {
	Response response = RestAssured.get("http://rmgtestingserver:8084/projects");
	System.out.println(response.asPrettyString());
	
}

}
