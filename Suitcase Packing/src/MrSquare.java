
public class MrSquare {
/*	Mr. Square is going on a holiday. He wants to bring 2 of his favorite squares with him, 
 * 	so he put them in his rectangle suitcase.

	Write a function that, given the size of the squares and the suitcase, 
	return whether the squares can fit inside the suitcase.
	
	fit_in(a,b,m,n)
	
	a,b are the sizes of the squares
	m,n are the sizes of the suitcase
 */
	
	public static Boolean fit_in(int a, int b, int m, int n) {
		// size of the suitcase
		if(a + b > m || n > 2) {
				return false;
			}
		return true;
	}
}
