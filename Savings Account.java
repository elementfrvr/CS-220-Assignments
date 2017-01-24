
public class CheckingAccount extends Account {
	private int accountFee;
	//Constructor
		public CheckingAccount(String Customer, double Balance, int Fee){
			super(Customer,Balance);
			accountFee= Fee;
		}
		public int getFee(){
			return accountFee;
		  }
		public void setInterest(int Fee){
		    accountFee = Fee;
		  }	

}
