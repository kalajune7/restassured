package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeWithArray;

public class Arraydeserialization 
{@Test
	public void deserial() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper omap=new ObjectMapper();
	EmployeeWithArray data = omap.readValue(new File("./arraydata.json"), EmployeeWithArray.class);
	System.out.println(data.getName());
	System.out.println(data.getPhone()[1]);
	
}

}

