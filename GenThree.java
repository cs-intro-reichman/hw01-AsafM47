/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        //generate 3 random numbers in the given range by the user.
        int rnd1 = (int)(Math.random() * (max - min)) + min;
        int rnd2 = (int)(Math.random() * (max - min)) + min;      
        int rnd3 = (int)(Math.random() * (max - min)) + min;

        int minr = Math.min(rnd1,rnd2);
        minr = Math.min(minr,rnd3);

        System.out.println(rnd1);
        System.out.println(rnd2);
        System.out.println(rnd3);
        System.out.println("The minimal number generated was: " + minr);
	}
}
