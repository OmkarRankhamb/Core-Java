package uss;

public class Discount_1 {

	public static void main(String[] args) {
		   boolean isFirstOrder= true;
		   double OrderAmount = 500;
		   
		   if(OrderAmount<=300) {
			   if(isFirstOrder==true) {
				   double discount = OrderAmount*0.30;
				   double FinalAmount = OrderAmount-discount;
				   System.out.println("you will gate 30 % discount\"+\"final payment: final payment=>"+discount);
			   }
			   
		   }
		   else {
			   double discount = OrderAmount*0.10;
			   double FinalAmount = OrderAmount-discount;
			   System.out.println("you will gate 10 % discount final payment:final Payment => "+ FinalAmount);
		   }

	}

}
