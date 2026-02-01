package day18.multilevel;

public class HDFC extends Bank {

	void getInterest()
	{
		System.out.println("Interest Rate of HDFC Bank");
	}
	
	public static void main(String[] args) {
		
		HDFC h=new HDFC();
		h.getInterest();
		h.bankInterest();
		h.interest();
	}
}
