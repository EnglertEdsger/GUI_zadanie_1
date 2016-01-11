package zad1;

public class BankCustomer {
	
	 String name;
	 Account konto=new Account();
	public BankCustomer(Person x) {
		name=x.x;
	}
	public Account getAccount() {
  		return konto;
  	}
  	public String toString()  {                 
    return "Klient: "+name+" stan konta "+konto.stan;
 	}
 	public void show() {
		System.out.println(toString());
 	}
} 