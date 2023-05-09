package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeewithSpouse;
import pojoclass.spouse;

public class EmpSpouseserialization {
@Test
public void empserial() throws JsonGenerationException, JsonMappingException, IOException 
{
	int[] arr= {345,653};
	spouse sp=new spouse("ram",arr,"eiriir");
	EmployeewithSpouse emp=new EmployeewithSpouse("kala",sp,arr);
	ObjectMapper omap=new ObjectMapper();
	omap.writeValue(new File("./empdata.json"), emp);
	
}
}
