public class powerof2 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		if (num >= 0 && num < 31) {
			int value = (int) Math.pow(2, num);
			System.out.println("Power of 2^" + num + " is: " + value);
			System.out.println();
			System.out.println("Printing all till Power Value " + num);

			for (int i = 1; i <= num; i++) {
				System.out.println("Power of 2^" + i + " is: " + (Math.pow(2, i)));
			}
		} else {
			System.out.println("number is not in range give number from 0 to 30 next time");
			System.exit(0);
		}

	}
}