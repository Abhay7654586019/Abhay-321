package Banks;

public class mainclass {
	public static void main(String args[]) {
	BankA a = new BankA();
	System.out.println("BankA = "+a.getBalance(1000));
	BankB b = new BankB();
	System.out.println("BankB = "+b.getBalance(1500));
	BankC c = new BankC();
	System.out.println("BankC = "+c.getBalance(2000));
}
}