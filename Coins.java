/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
 		int amount = Integer.parseInt(args[0]);
        int quarters = amount / 25 ; //the amount of quartes this number can be divided to 
        int cents = amount % 25; //the amount of cents left 
        System.out.println("Use " + quarters + " quarters and "+ cents + " cents");
	}
}