package NoArgsConstructor;


public class Second {

	public static void main(String[] args) {
		Customer c1 = new Customer("balu", 1212123, 67000);
		c1.printyRecord();
	}

}

class Customer {

	String name;
	int accnumber;
	float Balance;

	Customer(String name, int accnumber, float Balance) {
		this.name = name;
		this.accnumber = accnumber;
		this.Balance = Balance;

	}

	public void printyRecord() {
		System.out.println("name == " + name);
		System.out.println("accnumber==" + accnumber);
		System.out.println("Balance==" + Balance);
	}

	



	}


