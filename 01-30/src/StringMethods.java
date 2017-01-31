import java.util.*;

// some help from Pouya
/**
 * 
 * @author kamalnadesan
 *
 */
public class StringMethods {

	
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param n
	 * @return
	 */
	public static boolean endsWithRep(String s1, String s2, int n) {
		String output = "";
		if (n == 0) {
			System.out.println("true");
			return true;
		}
		// make a string that is made up of s2, n times
		for (int i = 0; i < n; i++) {
			output = output + s2;
		}
		if (s1.endsWith(output) == true) {
			System.out.println(output);
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false; 
		}

	}

	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "foobarbar";
		String s2 = "bar";
		int n = 2;
		endsWithRep(s1, s2, n);

	}


}
