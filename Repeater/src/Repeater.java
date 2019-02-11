
public class Repeater {

	public static void main(String[] args) {
	/* Create a function that accepts a string (string) and a long (n)
	 * as arguments, and then prints the string n number of times.
	 */
		
	}
	public static String repeat(String string,long n){
		String newString = "";
		Long t = new Long(n);
		int m = t.intValue();
		
	    for(int i=0; i < m; i++){
	      newString += string;
	    }
	    return newString;
	  }

}
