package arreglos;

import java.util.Arrays;

public class Anagrama {
	
	
	//Mi solocion O(N^2)
	public boolean esAnagrama(String palabra1, String palabra2) {
		
		String tmp = palabra2;
		
		if(palabra1.length() != palabra2.length())return false;

		for(int i=0;i<palabra1.length();i++) {
			char letra = palabra1.charAt(i);
			
			int j = 0;
			
			while( j < palabra2.length() ) {
				if(letra == tmp.charAt(j)) {
					String nuevaCadena = tmp.substring(0, j) + "" + tmp.substring(j+1);
					tmp = nuevaCadena;
					break;
				}
				
				j++;
			}
		}
		
		if(tmp.length() == 0)return true;
		
		return false;
	}
	
	
	//mejor solucion O(NlogN)
	public boolean bestSolution(char[] palabra1, char[] palabra2) {
		Arrays.sort(palabra1);
		Arrays.sort(palabra2);
		
		for(int i=0;i<palabra1.length;i++)
			if(palabra1[i]!=palabra2[i])
				return false;
		return true;
	}
	
}
