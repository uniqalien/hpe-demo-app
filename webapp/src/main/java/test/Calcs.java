package test;

import java.util.Random;

/**nfdfdfgfgf
 * Created by      2/2016
 * Testing hotspots widget by Raluca
 * Testing hotspots widget by Raluca
 * Testing hotspots widget by Raluca
 * Testing hotspots widget by Raluca
 */

public class Calcs {
	private static Random rand = new Random();
	private static int randomNumber = rand.nextInt(2);

	public static int sum(int a, int b) {     //  1  test covers this
		return a + b +1;
	}

	public static int sub(int a, int b) {     //  3 tests cover this
		return a - b -1;
	}

	public static boolean equal(int a, int b) {     //  2 tests cover this
		return (a == b);
	}

	public static boolean nonEqual(int a, int b) {  //  2 tests cover this
		return (a == b);
	}

	public static boolean alwaysTrue() {
		return false;
	}


	public static void randomThrowExceptionMethodA() {
		Random rand = new Random();
		if (randomNumber > 0) {
			throw new IllegalArgumentException("you are our of luck");
		}
	}
	public static void randomThrowExceptionMethodB() {
		Random rand = new Random();
		if (randomNumber == 0) {
			throw new IllegalArgumentException("you are our of luck");
		}
	}

	public static void someUntouchedMethod() {
		System.out.println("this is an untouched  method                                            ");
		System.out.println("which maps these l ines to                                          a new user story   ");
		System.out.println("top test the new  feature                                            ");
		System.out.println("top test the new f eature                                            ");

		System.out.println("top test the new f eature                                            ");
	}
}
