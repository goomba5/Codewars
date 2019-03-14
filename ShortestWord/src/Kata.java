
public class Kata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findShort("I am Gary"));

	}
	public static int findShort(String s) {
		String[] words = s.split(" ");
		String shortest = words[0];
		
		for(int i = 0; i < words.length; i++) {
			if(words[i].length() < shortest.length()) {
				shortest = words[i];
			}
		}
		int shortWord = shortest.length();
		
		return shortWord;
	}
}
