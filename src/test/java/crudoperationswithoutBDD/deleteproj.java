package crudoperationswithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteproj 
{
	@Test
	public void delete()
	{
		Response response = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_5128");
		response.then().log().all();
		int status=response.getStatusCode();
		Assert.assertEquals(204,status);
	}

}
