public class Homework5 {
/*
* Dev Kapadia
*/
	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	private String str;
	private static int second;
	private static int first;
	public Homework5(String s, int a, int b) {
		str = s;
		first = a;
		second = b;
	}

	/* Return a substring of the stored String, starting at index with
	 * length characters. If length would run past the end of the String,
	 * have the substring end at the end of the stored String.
	 * For example, if the stored String is "Happy" and the call is made
	 * substring(2, 5), the method should return "ppy"
	 * Note that the parameters in this method are different from the
	 * substring method in the String class
	 */
	public String substring(int index, int length) {
		int limit = str.length();
		if ((limit - index) > length) {
			String substr = str.substring(index, index + length);
			return substr;
		}
		else {
			length = limit - index;
			String substr = str.substring(index, index + length);
			return substr;
		}

	}

	/* Return true if the stored String contains the provided String,
	 * return false if it does not. Note that true and false are
	 * keywords in Java; I have provided a default return value as
	 * an example
	 */
	public boolean contains(String s) {
		int findStuff = str.indexOf(s);
		if (findStuff > -1) {
			return true;
		}
		else {
			return false;
		}
	}

	/* Return the larger of the two stored numbers
	 */
	public static int max() {
		if (first > second) {
			return first;
		}
		else if (second > first) {
			return second;
		}
		else {
			return -1;
		}
		}


	public static void main(String[] args) {
		int exitCode = 0;

		Homework5 hw5 = new Homework5("Hello, World!", 5, 6);

		if (hw5.substring(4, 4).equals("o, W")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw5.substring(7, 8).equals("World!")) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw5.contains("Hello")) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (!hw5.contains("Hello World")) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw5.max() == 6) {
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
