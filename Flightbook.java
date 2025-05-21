package task4.java;
import java.util.Scanner;

class Flight{
	Scanner air=new Scanner(System.in);
	String flightnum;
	String orgin;
	String destination;
	int price;
	
	Flight(String flightnum,String orgin,String destination,int price){
		this.flightnum=flightnum;
		this.orgin=orgin;
		this.destination=destination;
		this.price=price;
	}
}

class Passenger{
	Scanner air=new Scanner(System.in);
	String name;
	String passportnum;
	int age;
	String tra; String orgin;
	String tra1; String destination;
	int total;
	double weight;
	double wei;
	double totalwei;
	String exwei;
	int kg;
	double lugtotal;
	int upi;
	String mode;
	String mode1;
	String seat;
	String upiid;
	int payment;
	Flight fly;
	
	void travel() {
		Flight book =new Flight("A1234","Chennai","Dubai",19000);  //constructor value intialize
		Flight book1 =new Flight("B4567","Chennai","Madurai",6000);
		Flight book2 =new Flight("B7865","Madurai","Qatar",25600);
		Flight book3 =new Flight("D3446","Trichirapalli","Hydrabad",9500);
		Flight book4 =new Flight("A1S346","Trichiraplli","Kuwait",26800);
		Flight book5 =new Flight("D78G67","Madurai","Coimbatore",8700);
		Flight book6 =new Flight("S3452D45","SaudiArabia","Chennai",24200);
		
		System.out.println("Choose Your Destination" );
		System.out.println("Enter Your Orgin:");
		tra=air.next();
		System.out.println("Enter Your Destination:");
		tra1=air.next();
		
		if(tra.equalsIgnoreCase(book.orgin)) {
			if(tra1.equalsIgnoreCase(book.destination)) {
				System.out.println(book.flightnum+" "+book.orgin+" "+book.destination+" "+"Price is "+book.price);
				total+=book.price;
				orgin=book.orgin;
				destination=book.destination;
			}
		}
		if(tra.equalsIgnoreCase(book1.orgin)) {
		     if(tra1.equalsIgnoreCase(book1.destination)) {
					System.out.println(book1.flightnum+" "+book1.orgin+" "+book1.destination+" "+"Price is "+book1.price);
					total+=book1.price;
					orgin=book1.orgin;
					destination=book1.destination;
				}
		}
		
		if(tra.equalsIgnoreCase(book2.orgin)) {
	         if(tra1.equalsIgnoreCase(book2.destination)) {
					System.out.println(book2.flightnum+" "+book2.orgin+" "+book2.destination+" "+"Price is "+book2.price);
					total+=book2.price;
					orgin=book2.orgin;
					destination=book2.destination;
				}
			}
		
		if(tra.equalsIgnoreCase(book3.orgin)) {
		     if(tra1.equalsIgnoreCase(book3.destination)) {
					System.out.println(book3.flightnum+" "+book3.orgin+" "+book3.destination+" "+"Price is "+book3.price);
					total+=book3.price;
					orgin=book3.orgin;
					destination=book3.destination;
				}
		  		}
		if(tra.equalsIgnoreCase(book4.orgin)) {
		     if(tra1.equalsIgnoreCase(book4.destination)) {
					System.out.println(book4.flightnum+" "+book4.orgin+" "+book4.destination+" "+"Price is "+book4.price);
					total+=book4.price;
					orgin=book4.orgin;
					destination=book4.destination;
				}
	
		}
		if(tra.equalsIgnoreCase(book5.orgin)) {
		     if(tra1.equalsIgnoreCase(book5.destination)) {
					System.out.println(book5.flightnum+" "+book5.orgin+" "+book5.destination+" "+"Price is "+book5.price);
					total+=book5.price;
					orgin=book5.orgin;
					destination=book5.destination;
				}
		    
		}
		
		if(tra.equalsIgnoreCase(book6.orgin)) {
		     if(tra1.equalsIgnoreCase(book6.destination)) {
					System.out.println(book6.flightnum+" "+book6.orgin+" "+book6.destination+" "+"Price is "+book6.price);
					total+=book6.price;
					orgin=book6.orgin;
					destination=book6.destination;
				}    
		     
		}
		
		System.out.println("Fill Your Personal Details");
		passenger();
	}
	void passenger(){
		air.nextLine();
		System.out.println("Enter Your name:");
		name=air.nextLine();
		System.out.println("Enter Your Passport Number:");
		passportnum=air.nextLine();
		System.out.println("Enter Your Age:");
		age=air.nextInt();
		while(true) {
		System.out.println("Enter your luggage weight(max allowed=7kg) Pay on allowed 10kg");
		weight=air.nextDouble();
		wei=weight;
		if(weight<=7) {
			System.out.println("Your Luggage "+weight+"kg "+" "+"Is Allowed");
			break;
		}
		else if(weight<=10) {
			System.err.println("Your Luggage "+weight+"Kg "+" "+"Is Maximum So we are paying Extra kgs per kg=1200 And Pay on allowed 10kg");
			System.out.println("Choose Pay/Reduced");
			exwei=air.next();
			if(exwei.equals("Pay") || exwei.equals("pay")) {
//				System.out.println("Enter Your Extra Luggage kgs");
//				kg=air.nextInt();
				if(weight>7 && weight<=10) {
					int avgw=7;
					lugtotal=weight-avgw;
				    double total=weight*=1200;
				    totalwei=total-=1200*7;
				}
				break;
			}
			else if(exwei.equals("Reduced")||exwei.equals("reduced")) {
				
			}
			
		}
		else if(weight>10) {
			System.err.println("Your Luggage Over Weight Please Reduced");
			System.out.println("choose ok/cancel");
			String exwei1=air.next();
			if(exwei1.equals("Ok") || exwei1.equals("ok")) {
			
			}
			else {
				System.out.println("ReEnter Your details");
			}
		}
		}
		seats();
   }
	void seats() {
		String seatno1="w1"; String seatno2="w2"; String seatno3="f1"; String seatno4="f2"; String seatno5="a1"; String seatno6="a2";
		System.out.println("Selected Your Seat");
		System.out.println(seatno1+" "+seatno2+" "+seatno3+" "+seatno4+" "+seatno5+" "+seatno6); 
		seat=air.next();
		if(seat.equals(seatno1) || seat.equals(seatno2)) {
			System.out.println(seat);
		}
		System.out.println("Payment Details");
		payment();
		
	}
	void payment() {
		System.out.println("Your Ticket Total Amount Is"+" "+this.total);
		if(kg>7 || kg<=10) {
			System.out.println("Your Extra Luggage Is:"+" "+this.lugtotal+" "+"kgs");
			System.out.println("Your Luggage Amount Is:"+" "+this.totalwei);
			double tot=total+this.totalwei;
			System.out.println("Your Total Amount Is:"+" "+tot);
		}
		else {
			System.out.println("Your Total Amount Is"+" "+total);
		}
		System.out.println("Enter Your Payment Mode");
		System.out.println("1.UPI \n2.CARD \n3.CASH");
		int upi=air.nextInt();
		if(upi==1){
			mode="UPI";
			System.out.println("1.Gpay \n2.PhonePe \n3.Paytm");
			int pay=air.nextInt();
			switch(pay) {
			case 1:
				System.out.println("You Selected on Gpay...");
				System.out.println("Enter Your UPI id:");
				upiid=air.next();
				mode1="GPay:";
				break;
			case 2:
				System.out.println("You Selected on PhonePe...");
				System.out.println("Enter Your UPI id:");
				upiid=air.next();
				mode1="PhonePe:";
				break;
			case 3:
				System.out.println("You Selected on Paytm...");
				System.out.println("Enter Your UPI id:");
				upiid=air.next();
				mode1="Paytm:";
				break;
				default:
					System.out.println("Wrong payment option");
			
			}
			double tot=total+this.totalwei;
			System.out.println("Your Total Amount Is:"+" "+tot);
			System.out.println("Pay Your Amount:");
			double payment=air.nextInt();
			if(payment==tot) {
				System.out.println("Your Ticket Booked Successfully");
			}
			else{
				System.out.println("Not Recieve  On Payment Retry:");
				payment();
			}
		}
		else if(upi==2) {
			mode="CARD";
			System.out.println("1.Creditcard \n2.Debitcard");
			int pay=air.nextInt();
			switch(pay) {
			case 1:
				System.out.println("You Selected on Creditcard...");
				System.out.println("Enter Your Creditcard Number:");
				upiid=air.next();
				mode1="Creditcard:";
				break;
			case 2:
				System.out.println("You Selected on Debitcard...");
				System.out.println("Enter Your Debitcard Number:");
				upiid=air.next();
				mode1="Debitcard:";
				break;
			case 3:
				payment();
			}
			double tot=total+this.totalwei;
			System.out.println("Your Total Amount Is:"+" "+tot);
			System.out.println("Pay Your Amount:");
			double payment=air.nextInt();
			if(payment==tot) {
				System.out.println("Your Ticket Booked Successfully");
			}
			else {
				System.out.println("Not Recieve  On Payment Retry:");
				payment();
			}
		}
		else if(upi==3) {
			mode="CASH";
			mode1="Cash:";
			double tot=total+this.totalwei;
			System.out.println("Your Total Amount Is:"+" "+tot);
			System.out.println("Pay On Cash");
			System.out.println("Enter a cash Payment:");
			double payment=air.nextInt();
			if(payment==tot) {
				System.out.println("Your Ticket Booked Successfully");
			}
			else {
				System.out.println("Not Recieve  On Payment Retry:");
			}
		}
		else {
			System.out.println("Invalid Payment Mode");
		}
		System.out.println("Please once Check On Your Personal Details:");
		System.out.println("Invoice Print Press(5)");
		int print=air.nextInt();
		while(true) {
		if(print==5) {
			invoice();
			break;
		}
		else {
			Flightbook.main(null);
		}
		}
		System.out.println();
	}
	
	void invoice() {
		
		System.out.println("                             ----------Zaeem Airlines----------                                       ");
		System.out.println("                                   ****Happy Journey****                                              ");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println(" Passenger orgin:"+" "+this.orgin+"    <<------------------->>"+" "    +"Passenger Destination:"+" "+this.destination);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println(" Passenger Name:"+" "+this.name);
		System.out.println(" Passenger Passport Number:"+" "+this.passportnum);
		System.out.println(" Passenger Age:"+" "+this.age);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println(" Seat Number:"+" "+this.seat);
		System.out.println(" Luggage Total Weight:"+" "+this.wei+"Kgs"+"                          "+"Extra Luggage Weight:"+" "+this.lugtotal+"Kgs");
		System.out.println(" Ticket Amount is:"+this.total+"                                "+"Extra Luggage Amount Is:"+" "+this.totalwei);
		System.out.println("------------------------------------------------------------------------------------------------------");
		double tot=total+this.totalwei;
		System.out.println(" Payment details:");
		System.out.println(" Your Total Amount is:"+" "+tot);
		System.out.println(" Payment Mode Is:"+" "+this.mode);
		System.out.println(" "+this.mode+" "+"Mode Using"+" "+this.mode1+" "+"                        Your pay Amount is:"+" "+this.payment);
		System.out.println("------------------------------Thank you For Booking  Visit Again!--------------------------------------");
		
	} 
		
}

public class Flightbook {

	public static void cont() {
		Scanner air=new Scanner(System.in);
		Passenger pass=new Passenger();
		
		Flight book =new Flight("A1234","Chennai","Dubai",19000);  //constructor value intialize
		Flight book1 =new Flight("B4567","Chennai","Madurai",6000);
		Flight book2 =new Flight("B7865","Madurai","Qatar",25600);
		Flight book3 =new Flight("D3446","Trichirapalli","Hydrabad",9500);
		Flight book4 =new Flight("A1S346","Trichirapalli","Kuwait",26800);
		Flight book5 =new Flight("D78G67","Madurai","Coimbatore",8700);
		Flight book6 =new Flight("S3452D45","SaudiArabia","Chennai",24200);	
		
	    boolean tr=true;	
		System.out.println("**********Welcome To zaeem AirWays*********");
		while(tr) {
		System.out.println("Enter (1)Check a price (2)View on current flight (3)Booking (4)exit");
		int id=air.nextInt();       //input 
		
		if(id==1) {     //input on check price
		System.out.println("Enter your Orgin");
		String org=air.next();
		System.out.println("Enter your Destination");
		String des=air.next();
		
		if(org.equalsIgnoreCase(book.orgin)) {
			if(des.equalsIgnoreCase(book.destination)) {
				System.out.println(book.flightnum+" "+book.orgin+" "+book.destination+" "+"Price is "+book.price);
			}
		}
		if(org.equalsIgnoreCase(book1.orgin)) {
		     if(des.equalsIgnoreCase(book1.destination)) {
					System.out.println(book1.flightnum+" "+book1.orgin+" "+book1.destination+" "+"Price is "+book1.price);
				}
		}
		if(org.equalsIgnoreCase(book2.orgin)) {
	         if(des.equalsIgnoreCase(book2.destination)) {
					System.out.println(book2.flightnum+" "+book2.orgin+" "+book2.destination+" "+"Price is "+book2.price);
				}
			}
		if(org.equalsIgnoreCase(book3.orgin)) {
		     if(des.equalsIgnoreCase(book3.destination)) {
					System.out.println(book3.flightnum+" "+book3.orgin+" "+book3.destination+" "+"Price is "+book3.price);
				}
		}
		if(org.equalsIgnoreCase(book4.orgin)) {
		     if(des.equalsIgnoreCase(book4.destination)) {
					System.out.println(book4.flightnum+" "+book4.orgin+" "+book4.destination+" "+"Price is "+book4.price);
				}
		}
		if(org.equalsIgnoreCase(book5.orgin)) {
		     if(des.equalsIgnoreCase(book5.destination)) {
					System.out.println(book5.flightnum+" "+book5.orgin+" "+book5.destination+" "+"Price is "+book5.price);
				}
		}
		if(org.equalsIgnoreCase(book6.orgin)) {
		     if(des.equalsIgnoreCase(book6.destination)) {
					System.out.println(book6.flightnum+" "+book6.orgin+" "+book6.destination+" "+"Price is "+book6.price);
		     }
		}
		}
		if(id==2) {      //input on view on flight
			boolean vi=true;
			while(vi) {
			System.out.println("1.View on International Flight and Timing \n 2.View on Domestic Flight and Timing \n 3.Exit");
			int view=air.nextInt();
			if(view==1) {
				System.out.println(book.flightnum+" "+book.orgin+" "+"To"+" "+book.destination+" "+"Departure Time:23:00 \n");
				System.out.println(book2.flightnum+" "+book2.orgin+" "+"To"+" "+book2.destination+" "+"Departure Time:19:25 \n");
				System.out.println(book4.flightnum+" "+book4.orgin+" "+"To"+" "+book4.destination+" "+"Departure Time:00:50 \n");
				System.out.println(book6.flightnum+" "+book6.orgin+" "+"To"+" "+book6.destination+" "+"Arrival Time:7:25 \n");
				System.out.println();
			}
			else if(view==2) {
				System.out.println(book1.flightnum+" "+book1.orgin+" "+"To"+" "+book1.destination+" "+"Departure Time:15:30 \n");
				System.out.println(book3.flightnum+" "+book3.orgin+" "+"To"+" "+book3.destination+" "+"Departure Time:12:42 \n");
				System.out.println(book5.flightnum+" "+book5.orgin+" "+"To"+" "+book5.destination+" "+"Departure Time:21:45 \n");
				System.out.println();
			}
			else if(view==3) {
				vi=false;
				break;
			}
			else {
				System.out.println("No current Flight");
			}
			}
		}
		else if(id==3) {       //input on booking
			pass.travel();     //booking go to travel method
		}
		else if(id==4) {
			System.out.println("Thank You!");
			tr=false;
		}
	}
		air.close();
}
	
	
	public static void main(String[] args) {
		Scanner air=new Scanner(System.in);
			
		String email="aslam93615@gmail.com";
		String password="Asl@2003";
		
	for(int i=1;i<=3;i++) {
	System.out.println("Enter a Email");
	String mail=air.next();
	if(email.equals(mail)) {
		System.out.println("Enter a Password");
		String passw=air.next();
		if(password.equals(passw)){
			System.out.println("login Successfully");
			cont();
			break;
		}
			else {
				System.err.println("Invalid Password Maximum Attempts "+ (3-i) +" Reached");
			}
		}
		else {
			System.err.println("Invalid username Maximum Attempts "+ (3-i)+" Reached");
		}
	if(i==3) {
		System.out.println("Maxium Attempts Reached");
	}
		}
	air.close();
	}
}
