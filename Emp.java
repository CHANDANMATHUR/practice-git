package org.jsp.Abstraction;

public interface Employee 
{
	void behavior();
	void pressure();
}

public class Employee_Implementation_Class  implements Employee
{
	@Override
	public void behavior() 
	{
		System.out.println("Employee Nature is Awesome");
	}

	@Override
	public void pressure() 
	{
		System.out.println("Companies are giving more pressure to Employees");
	}
	

}

