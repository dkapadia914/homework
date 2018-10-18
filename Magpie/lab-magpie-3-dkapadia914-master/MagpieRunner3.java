import javax.swing.JOptionPane;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3 {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie3 maggie = new Magpie3();

		String response;
		String statement = "";
		boolean first = true;
		do {
			if (first) {
				first = false;
				response = maggie.getGreeting();
			} else {
				response = maggie.getResponse(statement);
			}
			System.out.println(response);
			statement = JOptionPane.showInputDialog(response);
			System.out.println(statement);
		} while (!statement.equals("Bye"));
	}

}
