interface Employee 
{
	void behavior();
	void pressure();
}

class Employee_Implementation_Class  implements Employee
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

			
	public static void main(String[] args) 
	{
		Employee e1  = new Employee_Implementation_Class();
		e1.behavior();
		e1.pressure();
		
	}

	

}



