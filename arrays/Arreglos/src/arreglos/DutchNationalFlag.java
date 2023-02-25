package arreglos;

public class DutchNationalFlag {
	
	//problema de ordenar un arreglo de números con 3 elementos en O(N)
	public int[] resolver(int[] arr) {
		int i = 0, j = 0, k = arr.length - 1;
		int tmp = 0;
		int pivote = 1;
		while(j <= k) {
			
			if(arr[j] < pivote) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j++;
			}
			
			else if(arr[j]>pivote) {
				tmp = arr[j];
				arr[j] = arr[k];
				arr[k] = tmp;
				k--;
			}
			
			else {
				j++;
			}
			
		}
		
		return arr;
	}
	
}
