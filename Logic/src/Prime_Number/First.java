package Prime_Number;

public class First {

	public static void main(String[] args) {
         /*
          * 1 to 10 primeNumbers
          */
		for (int num = 2; num <= 20; num++) {
			boolean isPrime = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;

				}
			}

			if (isPrime) {
				System.out.println(num);
			}
		}
	}

}
