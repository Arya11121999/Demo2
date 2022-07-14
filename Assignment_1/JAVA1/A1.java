import java.util.Scanner;
public class A1 {
	
	static double calculateBill(int units) {
		double bill;
		if(units<100)
			bill = units*1.20;
		else if(units<=300)
			bill = (units-100)*2 + 120;
		else
			bill = (units-300)*3 + 520;
		return bill;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		double bill = calculateBill(units);
		System.out.println("The current bill is : "+bill);
		sc.close();
	}
}
