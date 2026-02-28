package Basic;

public final class Fitth {

		static int num =3;
		static int num2 = 8;
		public Fitth(int num, int num2) {
			super();
			this.num = num;
			this.num2 = num2;
		}
		public static void print() {
		System.out.println(num+num2);
		}
	}


  class Dem{
	public static void main(String[] args) {
		
		Fitth f = new Fitth();
		
		System.out.println(f);
}
}