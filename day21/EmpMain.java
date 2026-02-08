package day21;

public class EmpMain {
	
	/*
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.empId=452;
		e1.empName="ABC";
		e1.salary=-89000;
		e1.employeeDetails();
	}*/
	
	public static void main(String[] args) {
		
		Employee e2=new Employee();
		e2.setEmpId(5000);
		System.out.println(e2.getEmpId());

		e2.setEmpName("Vinay");
		System.out.println(e2.getEmpName());
		
		e2.setSalary(50000.00);
		System.out.println(e2.getSalary());
		
		Employee e3=new Employee();
		e3.setEmpId(15000);
		System.out.println(e2.getEmpId());

		e3.setEmpName("Ajay");
		System.out.println(e2.getEmpName());
		
		e3.setSalary(70000);
		System.out.println(e2.getSalary());
		
	}

}
