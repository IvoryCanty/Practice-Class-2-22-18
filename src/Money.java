import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount Mula1 =  new SavingsAccount ("Jay", 100134, 100);
		SavingsAccount Mula2 = new SavingsAccount ("Aileen", 100190,1000);
		SavingsAccount Mula3 = new SavingsAccount ("John", 100153, 3213);
		
		Scanner scanner = new Scanner(System.in);
		
	System.out.println(" ");
		SavingsAccount CurrentAccount = new SavingsAccount(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
		
		SavingsAccount OverDraftAccount = new SavingsAccount(scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());
		System.out.println(" ");
	}

}
