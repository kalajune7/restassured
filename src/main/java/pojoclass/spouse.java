package pojoclass;

public class spouse 
{
	String name;
	int[] phone;
	String email;
	public spouse(String name,int[] phone,String email)
	{
		this.name=name;
		this.phone=phone;
		this.email=email;
		
	}
public spouse()
{
	
}
public String getName() {
	return name;
}
public int[] getPhone() {
	return phone;
}
public String getEmail() {
	return email;
}
}
