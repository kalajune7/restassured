package serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoclass.EmployeeWithArray;

public class ArraySerialization
{
	@Test
	

	public void arrserial() throws JsonGenerationException, JsonMappingException, IOException
	{	int[] arr= {3342,3443};
		EmployeeWithArray emp=new EmployeeWithArray("kala",arr);
		ObjectMapper omap=new ObjectMapper();
		omap.writeValue(new File("./arraydata.json"), emp);
	}

}
