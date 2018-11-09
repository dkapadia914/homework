/*
* Dev Kapadia
*/
public class Homework4 {
	private String str;
	int Dev = 0;
	private int integer;
	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	public Homework4(String s, int i) {
		str = s;
		integer = i;
	}

	/* Return the product of the stored number and the
	 * provided double. Cast the number after the
	 * multiplication
	 */
	public int multiply(double d) {
		int num1 = (int)(integer * d);
		return num1;

	}

	/* Add the two provided numbers, and then multiply the
	 * product by the stored number
	 */
	public double sumProduct(int a, double b) {
		double num2 = (a + b) * (integer);
		return num2;
	}

	/* Return the remainder of the first number divided by
	 * the integer portion of the provided double
	 */
	 public int remainder(double d) {
		 int num3 = (int) d;
		 num3 = integer % num3;
		 return num3;
	}

	/* Return the length of the stored String
	 */
	public int getLength() {
		int num4 = str.length();
		return num4;
	}

	/* Return the stored String followed by the provided
	 * String. Put a space between the two Strings
	 */
	public String concat(String s) {
		String string1 = str + " " + s;
		return string1;

	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework4 hw4 = new Homework4("Hello, World!", 5);

		if (hw4.multiply(2.5) == 12) { //how can this be a double if we cast it to an int, originally 12.25
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw4.sumProduct(2, 2.5) == 22.5) { //yeah i dont even know how you would get 20.25
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");

			exitCode += 1;
		}

		if (hw4.remainder(3.5) == 2) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (hw4.getLength() == 13) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw4.concat("Goodbye!").equals("Hello, World! Goodbye!")) { //inform Smith of the error, it originally didn't have a comma
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
