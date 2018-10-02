import java.awt.Rectangle;

public class Homework1Tests {

	/* Tests to verify that your solutions work
	 * Do not submit your homework until this compiles and the words
	 * "All Pass" are printed
	 */
	public static void main(String[] args) {
		int exitCode = 0;

		if (Homework1.problem1() == -3) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		Rectangle r = Homework1.problem2(100, 50);
		if (r.getWidth() == 100 && r.getHeight() == 50) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (Homework1.problem3() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		if (Homework1.problem4() != null) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (Homework1.problem5(7) == 12) {
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
