package uss;

public class Discount_2 {

	public static void main(String[] args) {
		boolean isFirstOrder = true;
		double OrderAmount = 500;

		if (OrderAmount >= 400) {
			if (isFirstOrder == true) {
				double Discount = OrderAmount * 0.30;
				double FinalAmount = OrderAmount - Discount;
				System.out.println("you will get 30 % disconut in final Payment=>" + FinalAmount);
			}
		}
		else {
			double Disconut = OrderAmount * 0.10;
			double FinalAmount = OrderAmount - Disconut;
			System.out.println("you will get 10 % discount in final payment => " + Disconut);
		}
		
	}

}
