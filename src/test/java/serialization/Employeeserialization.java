package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.Employee;

public class Employeeserialization 
{
@Test
public void emploserial() throws JsonGenerationException, JsonMappingException, IOException 
{
	Employee emp=new Employee(101,"kala");
	ObjectMapper omap=new ObjectMapper();
	omap.writeValue(new File("./data.json"), emp);
	
			
	
}
}
