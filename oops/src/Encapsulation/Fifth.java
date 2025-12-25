package Encapsulation;

public class Fifth {

	public static void main(String[] args) {
		Customer studentObj = new Customer();

		studentObj.setname("Alice");
		studentObj.setAge(21);

		studentObj.setAge(-5);

		System.out.println("Customer  Name: " + studentObj.getname());
		System.out.println("Customer  Age: " + studentObj.getAge());

	}
}

class Customer {
	private String name;
	private int Age;

	public String getname() {
		return name;

	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

}