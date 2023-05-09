package crudoperationdBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Getproj 
{
	@Test
	public void getaproj()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		when().get("/projects/TY_PROJ_5203")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		

		
	}

}
