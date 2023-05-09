package pojoclass;

public class Employee 
{
	int empno;
	String empname;
	int mobno;
	
	public Employee(int empno,String empname,int mobno) 
	{
		this.empno=empno;
		this.empname=empname;
		this.mobno=mobno;
		
	}
	public Employee(int empno,String empname) 
	{
		this.empno=empno;
		this.empname=empname;
		
		
	}
	
	
	public Employee() 
	{
		
	}
	public int getEmpno() {
		return empno;
	}
	public String getEmpname() {
		return empname;
	}
//	public int getMobno() {
//		return mobno;
//	}
	

}
