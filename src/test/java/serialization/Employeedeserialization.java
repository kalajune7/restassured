package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.Employee;

public class Employeedeserialization 
{

@Test
public void empdeserial() throws JsonParseException, JsonMappingException, IOException 
{
	ObjectMapper omap=new ObjectMapper();
	Employee data=omap.readValue(new File("./data.json"), Employee.class);
	System.out.println(data.getEmpname());
	System.out.println(data.getEmpno());
//	System.out.println(data.getMobno());
	
}
}
