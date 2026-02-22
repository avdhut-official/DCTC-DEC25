package day25;

public class TestImplementation {
	
	public static void main(String[] args) {
		
		LoginService u=new UserPortal();
		u.login();
		
		LogoutService s=new UserPortal();
		s.logout();
	}

}
