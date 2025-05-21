package task4.java;

import java.util.Scanner;

interface Account{
	Scanner inp = new Scanner(System.in);
	void debit();
	void credit();
	void balance();
}

class CUB implements Account{
	int bal=50000;
	int cbal;
	public void debit() {
		int minbal=500;
		System.out.println("Enter your Withdrawl amount:");
		int wdrwl=inp.nextInt();
		if(wdrwl>bal) {
			System.out.println("Insufficient Balance");
		}
		else if(bal-minbal>=wdrwl) {
			bal -= wdrwl;
			System.out.println("Your amount has been withdrawl Rs"+wdrwl+" "+"successfully");
		}
		else {
			System.out.println("Please maintain your minimum balance RS"+minbal);
		}
		
	}
	public void credit() {
		System.out.println("Enter your Deposit amount:");
		int debit=inp.nextInt();
		bal+=debit;
		System.out.println("Your deposited amount Rs"+debit+" "+"has been successfully");
		
	}
	public void balance() {
		System.out.println("Balance"+" "+bal);

		
	}
}

class IOB implements Account{
	int bal1=10000;
	int debit1;
	
	public void debit() {
		int minbal=1000;
		System.out.println("Enter your Withdrawl amount:");
		int wdrwl1=inp.nextInt();
		if(wdrwl1>bal1) {
			System.out.println("Insufficient Balance");
		}
		else if(bal1-minbal>=wdrwl1) {
			bal1-=wdrwl1;
			System.out.println("Your amount has been withdrawl Rs"+wdrwl1+" "+"successfully");
		}
		else {
			System.out.println("Please maintain your minimum balance RS"+minbal);
		}
	}
	public void credit() {
		System.out.println("Enter your Deposit amount:");
		debit1=inp.nextInt();
		bal1+=debit1;
		System.out.println("Your deposited amount Rs"+debit1+" "+"has been successfully");
//		balance();
		
	}
	public void balance() {
		System.out.println("Balance"+" "+bal1);
		
	}
}

public class Bankserver {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		CUB ob=new CUB();
		IOB ob1=new IOB();
		boolean B=true;
		
		while(B) {
			System.out.println("Select your Bank:");
			System.out.println("1.CUB");
			System.out.println("2.IOB");
			System.out.println("3.EXIT");
		int bank=inp.nextInt();

		if(bank==3) {
			System.out.println("Exit Program,Welcome");
			B=false;
		}
		else if(bank > 3) {
			System.out.println("Invalid Your Bank TryAgain!");	
		}
		
		if(bank==1) {
			boolean C=true;
			while(C) {
			System.out.println("Select your payment type:");
			System.out.println("1.Withdrawl");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");
			System.out.println("4.EXIT");
			
			int bank1=inp.nextInt();
			switch(bank1) {
			case 1:
				ob.debit();
			break;
			case 2:
				ob.credit();
				break;
		
			case 3:
				ob.balance();
				break;
			case 4:
				System.out.println("Thank you from CUB Visit Again!");
				break;
				default:
					System.out.println("Invalid payment method");
		}
			if(bank1==4) {
				C=false;
			}
			}
		}
		else if(bank==2) {
			boolean D=true;
			while(D) {
			System.out.println("Select your payment type:");
			System.out.println("1.Withdrawl");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");
			System.out.println("4.EXIT");
			
			int bank1=inp.nextInt();
			switch(bank1){
			case 1:
				ob1.debit();
				break;
			case 2:
				ob1.credit();	
				break;
			case 3:
				ob1.balance();
				break;
			case 4:
				System.out.println("Thank you from IOB Visit Again!");
				break;
				default:
					System.out.println("Invalid payment method");
			}
				if(bank1==4) {
					break;
				}
			}
			
		}
		}
		inp.close();
	}
}
