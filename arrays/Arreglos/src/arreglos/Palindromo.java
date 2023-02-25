package arreglos;

public class Palindromo {
	
	//O(N)
	public boolean esPalindromo(char[] palabra) {
		int i = 0, j = palabra.length -1;
		
		while(i < j) {
			if(palabra[i] != palabra[j])return false;
			i++;
			j--;
		}
		
		return true;
	}
}
