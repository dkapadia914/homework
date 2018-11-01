import javax.swing.JOptionPane;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie4 maggie = new Magpie4();

		String response = maggie.getGreeting();

		do {
			System.out.println(response);
			String statement = JOptionPane.showInputDialog(response);
			System.out.println(statement);
		} while (!statement.equals("Bye"));
	}

}
