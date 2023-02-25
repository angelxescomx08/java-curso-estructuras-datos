package arreglos;

import java.util.ArrayList;

public class RevirtiendoArreglo {
	
	static void revertirArreglo(ArrayList<Integer> arr) {
		
		int i = 0;
		int j = arr.size()-1;
		
		while(i<=j) {
			if(i != j) {
				int tmp = arr.get(i);
				
				arr.set(i, arr.get(j));
				arr.set(j, tmp);
			}
			
			i++;
			j--;
		}
		
	}
	
}
