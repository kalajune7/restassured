package differentwaypostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.genericutilities.javalibrary;

import io.restassured.http.ContentType;

public class HashmapType
{
@Test
public void hsh()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	javalibrary jlib=new javalibrary();
	HashMap jobj=new HashMap();
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
