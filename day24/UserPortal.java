package day24;

public class UserPortal implements LoginService, LogoutService{

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("User Loggd Out");
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		System.out.println("User Loggd In");
	}
	
	public static void main(String[] args) {
		UserPortal u=new UserPortal();
		u.login();
		u.logout();
	}
}
