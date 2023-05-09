package differentwaypostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.genericutilities.javalibrary;

import io.restassured.http.ContentType;
import pojoforRmg.pojo1;

public class Pojotype {

	@Test
	public void pojoo() throws JsonGenerationException, JsonMappingException, IOException {
		pojo1 po=new pojo1("kala","coodfr","created",10);
		//ObjectMapper omap=new ObjectMapper();
		//omap.writeValue(new File("./pojoooo.json"), po);
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().body(po).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
		
		
		
	}
	}

