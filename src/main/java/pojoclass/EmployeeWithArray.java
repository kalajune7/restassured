package pojoclass;

public class EmployeeWithArray {
	String name;
	int[] phone;
	public EmployeeWithArray(String ename,int[] mob)
	{
		name=ename;
		phone=mob;
		
	}
	public EmployeeWithArray()
	{
		
	}
	public String getName() {
		return name;
	}
	public int[] getPhone() {
		return phone;
	}
}
