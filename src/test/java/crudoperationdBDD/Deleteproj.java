package crudoperationdBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Deleteproj {
	@Test
	public void delete()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		when().delete("/projects/TY_PROJ_5237")
		.then().assertThat().contentType(ContentType.JSON).statusCode(204).time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		.log().all();
	}

}
