package day21;

public class Employee {
	
	//Before Encapsulation
	/*
	public int empId;
	public String empName;
	public double salary;
	
	public void employeeDetails()
	{
		empId=101;
		empName="Vinay";
		salary=-50000;
		
		System.out.println(empId+" "+empName+" "+salary);
	}
	*/
	
	//After Encapsulation
	private int empId;
	private String empName;
	private double salary;
	
	
	//getter methods
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	
	//setter methods
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(double salary) {
		if(salary > 0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Salary: Salary must be positive");
		}
	}
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}





