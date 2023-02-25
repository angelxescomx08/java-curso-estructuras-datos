package arreglos;

public class RevertirEntero {
	
	//O(N)
	public int revertir(int num) {
		
		String tmp = String.valueOf(num);
		String aux = "";
		
		for(int i=0;i<tmp.length();i++) {
			aux = tmp.charAt(i) + aux;
		}
		
		return Integer.parseInt(aux);
	}
	
	//Otra solución O(N)
	public int revertirNum(int n) {
		int resto = 0;
		int revertido = 0;
		
		while(n>0) {
			resto = n % 10;
			n = n / 10;
			revertido = revertido * 10 + resto;
		}
		return revertido;
	}
}
