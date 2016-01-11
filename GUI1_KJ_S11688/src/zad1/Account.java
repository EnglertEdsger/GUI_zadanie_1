package zad1;

public class Account { 

	  public double stan=0;
	  public static double procent=0;
	 
	  public Account() {
	  }
	  public Account(double x) {
	  	stan=x;
	  }
	  public static  void setInterestRate(double x) {
		  	procent=x;
		  }
	  public void transfer(Account y,double x) {                
		    if (x>stan) { 
		    	x=stan;
		  		System.out.println("ujemna wartosc");

		    }
		    this.withdraw(x);
		    y.deposit(x);        
		  }
	  public void deposit(double x) {
	  	stan+=x;
	  }
	  public void withdraw(double y){
		  if (y<0) { y =0;}
		  if (y>stan){stan=stan+y;}

		  	stan-=y;
		  	if (stan<0) {stan=0;}
	  }	  		
	  
	  public void addInterest() {
	  	stan=stan*(100+procent)/100;
	  }
}
	  