public class Homework7 {

	/* Use a while loop to add up the integers
	 * from 1 to x and return the result
	 */
	public static int problem1(int x) {
		int sum = 0;
		int iteration = 1;
		while (iteration <= x) {
			sum += iteration;
			iteration++;
		}
		return sum;
	}

	/* Use a loop (while or for) to find the
	 * first index of String t in String s.
	 * This is exactly what the standard
	 * indexOf method does, but you may not
	 * use that method, you must use a loop
	 */
	public static int problem2(String s, String t) {;
		int length = t.length();
		int start = 0;
		while (start <= (s.length() - length)) {
			String test = s.substring(start, length);
			if (test.equals(t)) {
				return start;
			}
			start++;
			length++;
		}
		String testString = s.substring(start);
		if (testString.equals(t)) {
			return start;
		}
		return -1;
	}

	/* Use a loop (while or for) to calculate and
	 * return the value of a raised to the b
	 * power
	 */
	public static int problem3(int a, int b) {
		int product = 1;
		int count = 0;
		while (count < b) {
			product *= a;
			count++;
		}
		return product;
	}

	/* Use a loop (while or for) to calculate and
	 * return the integer portion of a divided by
	 * b (i.e., calculate a / b using a loop)
	 */
	public static int problem4(int a, int b) {
		int integerPortion = 0;
		while ((a - b) > 0) {
			a = a - b;
			integerPortion++;
		}
		return integerPortion;
	}

	/* Use a loop (while or for) to calculate and
	 * return the remainder of a divided by b
	 * (i.e., calculate a % b using a loop)
	 */
	 public static int problem5(int a, int b) {
 		while ((a - b) > 0) {
 			a = a - b;
 		}
 		return a;
	 }

	public static void main(String[] args) {
		int exitCode = 0;

		if (Homework7.problem1(10) == 55) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}
		if (Homework7.problem2("Hello", "llo") == 2 &&
		Homework7.problem2("Goodbye", "q") == -1) {
		System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			System.out.println(Homework7.problem2("How", "o"));
			exitCode += 1;
		}

		if (Homework7.problem3(3, 3) == 27) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (Homework7.problem4(18, 5) == 3) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (Homework7.problem5(22, 6) == 4) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
