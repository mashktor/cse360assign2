/**
 * @author:         Miras Ashktorab
 * @date:           10/09/2019
 * @class ID:       70641
 * @Assignment:     Assignment 2    (package name: cse360assign2)
 *
 * @Description:    This assignment provides insight into version control (GitHub)
 * 					with practice to use git commands such as commit, add, status.
 */

package cse360assign2;


/**
 * Class AddingMachine is a very simple calculator.
 */
public class AddingMachine {

	/**
	 * Total holds the total calculated value
	 */
	private int total;

	/**
	 * calcInstructions holds the string the calculation instructions.
	 */
	private String calcInstruction;

	/**
	 * NOT NEEEDED, initializes the total variable
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		calcInstruction = "0 ";
	}

	/**
	 * This method gets total
	 * @return the total amount
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * This Method adds a value to the total
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		calcInstruction += "+ " + value + " ";
	}

	/**
	 * This Method subtracts a value from the total
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		calcInstruction += "- " + value + " ";
	}

	/**
	 * This Method converts the calculation instructions to a String
	 * @return String of calculation instructions
	 */
	public String toString () {
		return calcInstruction;
	}

	/**
	 * This Method clears the total variable
	 */
	public void clear() {
	    total = 0;
	    calcInstruction = "0 ";
	}
}
