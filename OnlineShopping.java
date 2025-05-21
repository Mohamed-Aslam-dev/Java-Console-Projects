package project;
import java.util.*;

class OutOfStockException extends Exception{
	OutOfStockException(){
		
	}
}
class LoginErrorException extends Exception{
	LoginErrorException(){
		
	}
}
class InvalidPaymentException extends Exception{
	InvalidPaymentException(){
		
	}
}

class Electronic{
	
	public void electronic(){
		Scanner shop=new Scanner(System.in);
		OrderProcess op=new OrderProcess();
		System.out.println("Choose Your Products and Check Price");
		String[] electric= {"Aser Laptop 102","Redmi note 13 103","Airpod21 104","Cherry Ipad 105"};
		for(String o:electric) {
			System.out.println(o);
		}
		try {
		System.out.println("Enter A Product Code:        Exit(3)");
		int prod=shop.nextInt();
		boolean pro=true;
		while(pro) {
		if(prod==102) {
			op.unitName="Aser Laptop";
			op.unitRate=35000;
			op.shipRate=0;
			op.sgst=9; op.cgst=9;
			System.out.println(electric[0]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==103) {
			op.unitName="Redmi Note 13";
			op.unitRate=16500;
			op.shipRate=159;
			op.sgst=9; op.cgst=9;
			System.out.println(electric[1]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==104) {
			op.unitName="Airpod 21";
			op.unitRate=499;
			op.shipRate=29;
			op.sgst=9; op.cgst=9;
			System.out.println(electric[2]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==105) {
			op.unitName="Cherry Ipad";
			op.unitRate=6500;
			op.shipRate=0;
			op.sgst=9; op.cgst=9;
			System.out.println(electric[3]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==3) {
			pro=false;
		}
		else {
			throw new OutOfStockException();
		}
		}
		}
		catch(Exception a) {
			System.out.println(a);
		//	electronic();
		}
		shop.close();
	}
}
class Clothing extends Electronic{
	int prod;
//	String book;
	void clothing(){
		Scanner shop=new Scanner(System.in);
		OrderProcess op=new OrderProcess();
		System.err.println("Offer..Offer Buy2 Boys Casual shirt Get10% Offer");
		System.out.println("Choose Your Products and Check Price");
		String cloths[]= {"Boys Tshirt 301","Boys Casual Shirt 303","Boys Jeans Pant 302","Cotten Pant 304"};
		for(String o:cloths) {
			System.out.println(o);
		}
		while(true) {
			try {
				System.err.println("Offer..Offer Buy2 Boys Casual shirt Get10% Offer");
		System.out.println("Enter A Product Code:        Exit(3)");
		prod=shop.nextInt();
		if(prod==301) {
			op.unitName="Boys TShirt";
			op.unitRate=299;
			op.shipRate=0;
			op.sgst=6; op.cgst=6;
			System.out.println(cloths[0]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==302) {
			op.unitName="Boys JeansPant";
			op.unitRate=799;
			op.shipRate=59;
			op.sgst=2.5f; op.cgst=2.5f;
			System.out.println(cloths[2]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==303) {
			op.unitName="Boys CasualShirt";
			op.unitRate=599;
			op.shipRate=29;
			op.sgst=6; op.cgst=6;
			System.out.println(cloths[1]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				if(op.qty>=2) {
					op.off=op.unitRate*10/100;
					op.unitRate-=op.off;
					op.order();
				}
				else {
				op.order();
				}

			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		if(prod==304) {
			op.unitName="Boys CottenPant";
			op.unitRate=699;
			op.shipRate=0;
			op.sgst=2.5f; op.cgst=2.5f;
			System.out.println(cloths[3]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==3) {
			break;
		}
		else {
			throw new OutOfStockException();
		}
			}
			catch(Exception a) {
				System.out.println(a);
			}
		}
		shop.close();
	}
}
class Grocery extends Electronic{
	void grocery() {
		Scanner shop=new Scanner(System.in);
		OrderProcess op=new OrderProcess();
		System.out.println("Choose Your Products and Check Price");
		String grocer[]= {"3Roses 100gm 81","Egg 10pc 82","Maaza 600ml 78","Sugar 1KG 74"};
		for(String o:grocer) {
			System.out.println(o);
		}
		while(true) {
			try {
		System.out.println("Enter A Product Code:        Exit(3)");
		int prod=shop.nextInt();
		if(prod==81) {
			op.unitName="3Roses 100gm";
			op.unitRate=84;
			op.shipRate=2;
			op.sgst=6; op.cgst=6;
			System.out.println(grocer[0]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==82) {
			op.unitName="Egg 10pc";
			op.unitRate=55;
			op.shipRate=0;
			op.sgst=0f; op.cgst=0f;
			System.out.println(grocer[1]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==78) {
			op.unitName="Maaza 600ml";
			op.unitRate=32;
			op.shipRate=2;
			op.sgst=14; op.cgst=14;
			System.out.println(grocer[2]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		if(prod==74) {
			op.unitName="Sugar 1kg";
			op.unitRate=44;
			op.shipRate=1;
			op.sgst=2.5f; op.cgst=2.5f;
			System.out.println(grocer[3]+" Rs."+op.unitRate+" Shipping charge Rs."+op.shipRate);
			System.out.println("Do You Want Order press(O) cancel(No)");
			String book=shop.next();
			if(book.equalsIgnoreCase("o")) {
				System.out.println("Enter Your Quantity:");
				op.qty=shop.nextInt();
				op.order();
			}
			else if(book.equalsIgnoreCase("no")) {
				break;
			}
			break;
		}
		else if(prod==3) {
			break;
		}
		else {
			throw new OutOfStockException();
		}
			}
			catch(Exception a) {
				System.out.println(a);
			}
		}

	}
	
	
}
class OrderProcess extends Clothing{
	int unitRate;
	int shipRate;
	int qty;
	int tot;
	int total;
	String name;
	String address;
	String city;
	String unitName;
	int cod;
	int codCharge;
	float cgst;
	float sgst;
	float cgstRate;
	float sgstRate;
	float gst;
	String mode;
	String mode1;
	int pay;
	int off;
	long phone;
	void order() {
		Scanner shop=new Scanner(System.in);
//		System.out.println("Enter Your Quantity:");
//		qty=shop.nextInt();
		cgstRate=unitRate*cgst/100;
//		System.out.println(cgstRate);
		sgstRate=unitRate*sgst/100;
//		System.out.println(sgstRate);
		gst=unitRate-cgstRate-sgstRate;
//		System.out.println(gst);
		tot=unitRate*qty+shipRate;
		total=tot;
		System.out.println("Your Product Amount Is"+" "+unitRate);
		System.out.println("Shipping Charge Is"+" "+shipRate);
		System.out.println("Your Offer Amount Is"+" "+off*qty);
		System.out.println("Your Total Amount Is"+" "+total);
		System.out.println("--------------------------------------");
		System.out.println("Select Ypur Payment Method:");
		System.out.println("1.Card \n2.UPI \n3.Cash On Delivery \n4.Exit");
		int payment=shop.nextInt();
		if(payment==1) {
			mode="Card";
			card();
		}
		else if(payment==2) {
			mode="UPI";
			upi();
		}
		else if(payment==3) {
			mode="Cash On Delivery";
			cod();
		}
		shop.close();
	}
	void card() {
		Scanner shop=new Scanner(System.in);
		while(true) {
			try {
		System.out.println("Choose Your Card:");
		System.out.println("1.Debitcard \n2.Creditcard \n3.exit");
		int choose=shop.nextInt();
		if(choose==1) {
			mode1="DebitCard";
			System.out.println("You Choose On DebitCard");
			System.out.println("Enter Your DebitCard Number:");
			long debit=shop.nextLong();
				System.out.println("Valid Your Card:");
				System.out.println("Your Total amount is"+" "+tot);
				System.out.println("Pay Your Amount:");
				pay=shop.nextInt();
				
				if(pay==tot) {
					shop.nextLine();
					System.out.println("Your Payment Is SuccessFully Completed");
					System.out.println("Enter Your Name:");
					
					name=shop.nextLine();
					System.out.println("Enter Your HouseNo Address:");
//					shop.nextLine();
					address=shop.nextLine();
					System.out.println("Enter Your City:");
					city=shop.nextLine();
					System.out.println("Enter Your Phone No:");
					phone=shop.nextLong();
					System.out.println("Your Order Is Successfully Completed");
					System.out.println("Print Your Invoice press(5)");
					int print=shop.nextInt();
					if(print==5) {
						invoice();
					}
				}
				else {
					throw new InvalidPaymentException();
				}
			break;
		}
		else if(choose==2) {
			mode1="CreditCard";
			System.out.println("You Choose On CreditCard");
			System.out.println("Enter Your CreditCard Number:");
			long debit=shop.nextLong();
			System.out.println("Valid Your Card:");
			System.out.println("Your Total amount is"+" "+tot);
			System.out.println("Pay Your Amount:");
			pay=shop.nextInt();
			if(pay==tot) {
				shop.nextLine();
				System.out.println("Your Payment Is SuccessFully Completed");
				System.out.println("Enter Your Name:");
				name=shop.nextLine();
				System.out.println("Enter Your HouseNo Address:");
				address=shop.nextLine();
				System.out.println("Enter Your City:");
				city=shop.nextLine();
				System.out.println("Enter Your Phone No:");
				phone=shop.nextLong();
				System.out.println("Your Order Is Successfully Completed");
				System.out.println("Print Your Invoice press(5)");
				int print=shop.nextInt();
				if(print==5) {
					invoice();
				}
			}
			else {
				throw new InvalidPaymentException();
			}
			break;
		}
		else if(choose==3) {
			break;
		} 
		else {
			throw new InvalidPaymentException();
		}
		}
			catch(Exception a) {
				System.out.println(a);
			}
		}
		shop.close();
	}
	public void upi() {
		Scanner shop=new Scanner(System.in);
		while(true) {
			try {
		System.out.println("You Choose On UPI:");
		System.out.println("1.Gpay \n2.PhonePe \n3.Paytm \n4.Exit");
		int choose=shop.nextInt();
		if(choose==1) {
			mode1="GPay";
			System.out.println("You Pay On Gpay:");
			System.out.println("Enter Your upi id:");
			String upi=shop.next();
			System.out.println("Valid Your Upi");
			System.out.println("Your Total amount is"+" "+tot);
			System.out.println("Pay Your Amount:");
			pay=shop.nextInt();
			if(pay==tot) {
				shop.nextLine();
				System.out.println("Your Payment Is SuccessFully Completed");
				System.out.println("Enter Your Name:");
				name=shop.nextLine();
				System.out.println("Enter Your HouseNo Address:");
				address=shop.nextLine();
				System.out.println("Enter Your City:");
				city=shop.nextLine();
				System.out.println("Enter Your Phone No:");
				phone=shop.nextLong();
				System.out.println("Your Order Is Successfully Completed");
				System.out.println("Print Your Invoice press(5)");
				int print=shop.nextInt();
				if(print==5) {
					invoice();
				}
			}
			else {
				throw new InvalidPaymentException();
			}
			break;
		}
		else if(choose==2) {
			mode1="PhonePe";
			System.out.println("You Pay On PhonePe:");
			System.out.println("Enter Your upi id:");
			String upi=shop.next();
			System.out.println("Valid Your Upi");
			System.out.println("Your Total amount is"+" "+tot);
			System.out.println("Pay Your Amount:");
			pay=shop.nextInt();
			if(pay==tot) {
				shop.nextLine();
				System.out.println("Your Payment Is SuccessFully Completed");
				System.out.println("Enter Your Name:");
				name=shop.nextLine();
				System.out.println("Enter Your HouseNo Address:");
				address=shop.nextLine();
				System.out.println("Enter Your City:");
				city=shop.nextLine();
				System.out.println("Enter Your Phone No:");
				phone=shop.nextLong();
				System.out.println("Your Order Is Successfully Completed");
				System.out.println("Print Your Invoice press(5)");
				int print=shop.nextInt();
				if(print==5) {
					invoice();
				}
			}
			else {
				throw new InvalidPaymentException();
			}
			break;
		}
		if(choose==3) {
			mode1="Paytm";
			System.out.println("You Pay On Paytm:");
			System.out.println("Enter Your upi id:");
			String upi=shop.next();
			System.out.println("Valid Your Upi");
			System.out.println("Your Total amount is"+" "+tot);
			System.out.println("Pay Your Amount:");
			pay=shop.nextInt();
			if(pay==tot) {
				shop.nextLine();
				System.out.println("Your Payment Is SuccessFully Completed");
				System.out.println("Enter Your Name:");
				name=shop.nextLine();
				System.out.println("Enter Your HouseNo Address:");
				address=shop.nextLine();
				System.out.println("Enter Your City:");
				city=shop.nextLine();
				System.out.println("Enter Your Phone No:");
				phone=shop.nextLong();
				System.out.println("Your Order Is Successfully Completed");
				System.out.println("Print Your Invoice press(5)");
				int print=shop.nextInt();
				if(print==5) {
					invoice();
				}
			}
			else {
				throw new InvalidPaymentException();
			}
			break;
		}
		else if(choose==4) {
			break;
		}
		
		else {
			throw new InvalidPaymentException();
		}
			}
			catch(Exception a) {
				System.out.println(a);
			}
		
		}
//		shop.close();
	}
	public void cod() {
		Scanner shop=new Scanner(System.in);
		while(true) {
			try {
		System.out.println("You Choose On Cash On Delivery");
		cod=20;
		System.out.println("Extra Chrages Can Be Apply On COD RS."+cod+" OK on Press(1) Cancel press(2)");
		codCharge=shop.nextInt();
		if(codCharge==1) {
			mode1="COD";
			System.out.println("Your Product Amount Is Rs."+tot);
			System.out.println("Your COD Charge Rs."+cod);
			System.out.println("-----------------------------");
			total=tot+cod;
			System.out.println("Your Total Amount Is Rs."+total);
			System.out.println("Confirm On Press(1) Cancel(2)");
			int confirm=shop.nextInt();
			if(confirm==1) {
				shop.nextLine();
				System.out.println("Enter Your Name:");
				name=shop.nextLine();
				System.out.println("Enter Your HouseNo Address:");
				address=shop.nextLine();
				System.out.println("Enter Your City:");
				city=shop.nextLine();
				System.out.println("Enter Your Phone No:");
				phone=shop.nextLong();
				System.out.println("Your Order Is Successfully Completed");
				System.out.println("Print Your Invoice press(5)");
				int print=shop.nextInt();
				if(print==5) {
					invoice();
				}
			}
			break;
		}
		else if(codCharge==2) {
			break;
		}
		else {
			throw new InvalidPaymentException();
		}
			}
			catch(Exception a) {
				System.out.println(a);
			}
	}
//		shop.close();
	}
	void invoice() {
		while(true) {
		System.out.println("------------Seller Details------------");
		System.out.println(" ZAEEM & CO                           ");
		System.out.println(" GSTIN:33AYIPT4341G1ZA                ");
		System.out.println(" No123,Kamarajar Road                 ");
		System.out.println(" Salaiyoor,Ilayangudi                 ");
		System.out.println("-------------TAX INVOICE--------------");
		System.out.println("Order Date : 03/12/2024               ");
		System.out.println("Delivery Date : 04/12/2024(Expected)  ");
		System.out.println("--------------------------------------");
		System.out.println("Cust.Name-"+this.name                  );
		System.out.println("Cust.Address-"+this.address            );
		System.out.println("Cust.City-"+this.city                  );
		System.out.println("Cust.Phone No-"+this.phone             );
		System.out.println("--------------------------------------");
		System.out.println("Product            |Qty   |    Total"  );
		System.out.println("--------------------------------------");
		System.out.println(this.unitName +"    |"+qty+"   |  "+gst*qty);
		System.out.println("        Shipping charge|   "+shipRate);
		if(codCharge==1) {
		System.out.println("                COD charge|   "+cod);
		}
		System.out.println("               CGST"+cgst+"%|   "+cgstRate*qty);
		System.out.println("               SGST"+sgst+"%|   "+sgstRate*qty);
		System.out.println("--------------------------------------");
		System.out.println("              Total Amount|   "+total);
		System.out.println("            Paid On Amount|   "+pay);
		System.out.println("                          ------------");
		int c=total-pay;
		System.out.println("                             "+c+"    "); 
		System.out.println("--------------------------------------");
		System.out.println("Your Offer Amount Is--"+off*qty+"     ");
		System.out.println("Payment Mode : "+mode+"               ");
		System.out.println("We Are Using To Pay : "+mode1+"       ");
		System.out.println("                                      ");
		System.out.println("--------------------------------------");
		System.out.println("Note:Once Sold Products Can Be Return ");
		System.out.println("Back Within 7 Days Above This Days Can");
		System.out.println("-not Be Taken Return Back             ");
		System.out.println("--------------------------------------");
		System.out.println("******Thank You..! Visiting again*****");
		break;
		}
	}
}

class Customer {
	private String name;
	private int id;
	Customer(String name,int id){
		this.name=name;
		this.id=id;
	}
	String getname() {
		return name;
	}
	int getid() {
		return id;
	}
}

public class OnlineShopping {
	
	static void order() {
		Clothing as=new Clothing();
		Grocery asl=new Grocery();
		Scanner shop=new Scanner(System.in);
		System.out.println("Welcome to ZAEEM&co");
		boolean cat=true;
		while(cat) {
			System.err.println("Offer..Offer Buy2 Boys Casual shirt Get10% Offer");
		System.out.println("CATEGORY:Electronics(1),Clothings(2),Grocery(3),Exit(4)");
		int category=shop.nextInt();
		if(category==1) {
			as.electronic();
			System.out.println();
		}
		else if(category==2) {
			as.clothing();
			System.out.println();
		}
		else if(category==3) {
			asl.grocery();
		}
		else if(category==4) {
			cat=false;
			System.out.println("Thank you..Welcome!");
		}
		else {
			System.out.println("error");
		}
		cat=false;
		}
//		shop.close();
	}

	public static void main(String[] args) {

		Scanner shop=new Scanner(System.in);
		Customer ord1=new Customer("Aslam",21);
		Customer ord2=new Customer("Sheriff",22);
		Customer ord3=new Customer("Nifan",23);
		Customer ord4=new Customer("Udhaya",24);
		Customer ord5=new Customer("Shajith",25);
		Random otp=new Random();
		try {
		System.out.println("*********Login page**********");
		System.out.println("Enter Your Name:");
		System.err.println("First Letter Is Uppercase");
		String nam=shop.nextLine();
		System.out.println("Enter Your ID:");
		int i=shop.nextInt();
		int ot=otp.nextInt(100000, 999999);
		System.err.println(ot);
		System.out.println("Enter Your 6 Digit OTP:");
		int otpp=shop.nextInt();
		if(nam.equals(ord1.getname()) && i==ord1.getid() && otpp==ot) {
			OnlineShopping.order();
		}
		else if(nam.equals(ord2.getname()) && i==ord2.getid() && otpp==ot) {
			OnlineShopping.order();
		}
		else if(nam.equals(ord3.getname()) && i==ord3.getid() && otpp==ot) {
			OnlineShopping.order();
		}
		else if(nam.equals(ord4.getname()) && i==ord4.getid() && otpp==ot) {
			OnlineShopping.order();
		}
		else if(nam.equals(ord5.getname()) && i==ord5.getid() && otpp==ot) {
			OnlineShopping.order();
		}
		
		else {
			throw new LoginErrorException();
		}
		}
		catch(Exception a) {
			System.out.println(a);
		}
		shop.close();
	}
}
