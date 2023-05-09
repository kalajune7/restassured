package crudoperationswithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Getproj {
	@Test
	public void get() {
		Response response = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_5072");
		//System.out.println(response.asPrettyString());
		response.then().log().all();
		int actionstatus=response.getStatusCode();
		Assert.assertEquals(200, actionstatus);
	}

}
