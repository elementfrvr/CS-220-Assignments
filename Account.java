public class Account {
private String accountCustomer;
private double accountBalance;

//Constructor
	public Account(String Customer, double Balance){
		accountCustomer=Customer;
		accountBalance=Balance;
	}
	public String getCustomer(){
		return accountCustomer;
	  }
	public void setCustomer(String Customer){
	    accountCustomer=Customer;
	}
	public double getBalance(){
		return accountBalance;
	  }
	public void setBalance(double Balance){
	    accountBalance=Balance;
	}
	
}
