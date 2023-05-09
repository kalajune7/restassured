package pojoclass;

public class EmployeewithSpouse 
{
	String ename;
	spouse spouse;
	int[] phone;
	public EmployeewithSpouse(String ename,spouse spouse,int[] phone)
	{
		this.ename=ename;
		this.spouse=spouse;
		this.phone=phone;
		
	}
	public EmployeewithSpouse() {
		
	}
	public String getEname() {
		return ename;
	}
	public spouse getSpouse() {
		return spouse;
	}
	public int[] getPhone() {
		return phone;
	}

}
