
public class dnaTorna {

	public static void main(String[] args) {
		String rna = convert("GCAT");
		String rna1 = convert("TTTT");
		
		System.out.println(rna);
		System.out.println(rna1);
	}
	
	public static String convert(String dna) {
		String rna = "";
		
		for(int i=0; i < dna.length(); i++) {
			
			if(Character.toString(dna.charAt(i)).equalsIgnoreCase("T")) {
				rna += Character.toString(dna.charAt(i)).replaceAll("T", "U");
			}
			else {
				rna += Character.toString(dna.charAt(i));
			}
		}
		return rna;
	}

}
