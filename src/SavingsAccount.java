
public class SavingsAccount {

		String username;
		int Pin;
		double Balance;

		public SavingsAccount(String username2, int Pin2, double Balance2){
			username = username2;
			Pin = Pin2;
			Balance = Balance2;	
		}
			public double withdraw(double with){
				
double amount = (Balance - with);
return amount;
				
			}
public double Deposit (double Depo){
double amount = (Balance + Depo);
return amount;
}


		


	}
