package NoArgsConstructor;

public class Fifth {

	public static void main(String[] args) {
		
		        Bike bike1 = new Bike();
		        bike1.display(); 

		        Bike bike2 = new Bike("Mountain Bike", 2022);
		        bike2.display(); 
	}
		

	}


  class Bike {
    String modelName;
    int year;

    public Bike() {
        this.modelName = "Unknown";
        this.year = 0;
    }

    public Bike(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
    }

    public void display() {
        System.out.println("Model: " + modelName + ", Year: " + year);
    }
}

