package AtmInterface;

public class Main_Atm {


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Atm_Interface AI=new Atm_Interface(500);
		Bank_Account obj=new Bank_Account(AI);
		obj.display();
	}

}