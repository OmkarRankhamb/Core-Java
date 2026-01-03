package Basic;

public class Singal_t_1 {

	public static Singal_t_1 p1;
	/**
	 * SingalTonn staic method / bolck we have creat multipal objet og this givan
	 * class i can have only one static bolck can print..
	 */

	static {
		p1 = new Singal_t_1();
		System.out.println(" om");
	}

	public static Singal_t_1 intin() {
		return p1;
	}

	public static void main(String[] args) {
		Singal_t_1 p1 = Singal_t_1.intin();
		Singal_t_1 p2 = Singal_t_1.intin();
		Singal_t_1 p3 = Singal_t_1.intin();
	}

}
