package Aug27;

public class Main {
	public static void main(String[] args){
		Account A1 = new Account("Fatima Arshad",100);
		A1.deposit(1000);
		A1.withdraw(2000);
		System.out.println(A1.toString());
	}
}
