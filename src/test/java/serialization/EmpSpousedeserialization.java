package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeewithSpouse;

public class EmpSpousedeserialization {
@Test
public void empdeserial() throws JsonParseException, JsonMappingException, IOException
{
	ObjectMapper omap=new ObjectMapper();
	EmployeewithSpouse data = omap.readValue(new File("./empdata.json"), EmployeewithSpouse.class);
	System.out.println(data.getEname());
	System.out.println(data.getPhone()[0]);
	System.out.println(data.getSpouse().getName());
	System.out.println(data.getSpouse().getEmail());
	
	System.out.println(data.getSpouse().getPhone()[0]);
	
}
}
