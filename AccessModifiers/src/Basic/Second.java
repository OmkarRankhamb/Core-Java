package Basic;

public class Second {

	public static void main(String[] args) {
		Data d = new Data();

		d.setName("Programiz");
		System.out.println(d.getName());
	}
}

class Data {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
