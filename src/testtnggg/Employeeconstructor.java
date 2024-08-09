package testtnggg;

public class Employeeconstructor
{
    int empid;
    String empname;
    int salary;
    
    public Employeeconstructor(int empid, String empname, int salary)
    {
    	this.empid=empid;
    	this.empname=empname;
    	this.salary=salary;
    }
    
    public void display()
    {
    	System.out.println("employee id: "+empid);
    	System.out.println("employee name: "+empname);
    	System.out.println("employee salary: "+salary);
    }
	public static void main(String[] args)
	{
		Employeeconstructor emp=new Employeeconstructor(101,"Abc",35);
		emp.display();

	}

}
