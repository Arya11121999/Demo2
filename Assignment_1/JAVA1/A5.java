import java.util.Scanner;


	class Account{
		private String accountNo;
		private double accountBalance;
		private String accountPassword;
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public double getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(double accountBalance) {
			this.accountBalance = accountBalance;
		}
		public String getAccountPassword() {
			return accountPassword;
		}
		public void setAccountPassword(String accountPassword) {
			this.accountPassword = accountPassword;
		}
		Account(){
			accountNo = "";
			accountBalance = 0.0;
			accountPassword = "";
		}
		public Account(String accountNo, double accountBalance, String accountPassword) {
			this.accountNo = accountNo;
			this.accountBalance = accountBalance;
			this.accountPassword = accountPassword;
		}
		void displayAccount() {
			System.out.println("Account No : "+accountNo);
			System.out.println("Account Balance : "+accountBalance);
			System.out.println("Account Password : "+accountPassword);
		}
		
	}
	
class A5{		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String accountNo = sc.nextLine();
		double accountBalance = sc.nextDouble();sc.nextLine();
		String accountPassword = sc.nextLine();
		Account acc = new Account();
		acc.setAccountNo(accountNo);
		acc.setAccountBalance(accountBalance);
		acc.setAccountPassword(accountPassword);
		System.out.println();
		acc.displayAccount();
		sc.close();
	}
}