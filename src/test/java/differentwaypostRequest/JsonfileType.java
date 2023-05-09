package differentwaypostRequest;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class JsonfileType
{
@Test
public void jsonfilepost() 
{ 
	baseURI="http://rmgtestingserver";
	port=8084;
	File fi=new File("./data1.json");
	given()
	.body(fi)
	.contentType(ContentType.JSON)
	.when()
	.post("/addProject")
	.then()
	.assertThat()
	//.statusCode(201)
	//.contentType(ContentType.JSON)
	//.time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
	.log().all();
}
}
