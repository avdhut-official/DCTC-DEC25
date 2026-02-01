package day18.hierarchical;

public class TestHierarchicalInheritance {
		
	public static void main(String[] args) {
		
		Admin a1=new Admin();
		a1.login();
		a1.manageUsers();
		a1.logout();
		
		Customer c1=new Customer();
		c1.login();
		c1.placeOrder();
		c1.logout();
		
		SupportAgent s1=new SupportAgent();
		s1.login();
		s1.resolveTickets();
		s1.logout();
	}

}
