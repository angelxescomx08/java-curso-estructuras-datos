package arreglos;

public class AguaRetenidad {
	
	//O(N) sin memoria extra mi solución
	public int resolver(int[] arr) {
		int masAlto = -1;
		int area = 0;
		int largo = 0;
		int resultado = 0;
		for(int i=0;i<arr.length;i++) {
			if(masAlto == -1) {
				masAlto = arr[i];
			}
			else if(masAlto <= arr[i]) {
				resultado += (largo*masAlto) - area;
				masAlto = arr[i];
				area = 0;
				largo=0;
			}else {
				area += arr[i];
				largo++;
			}
		}
		
		return resultado;
	}
	
	
	//solución del curso con uso de memoria extra O(N)
	
	public int resolverCurso(int[] arr) {
		int j = arr.length - 1;
		int[] maxLeft = new int[arr.length];
		int[] maxRight = new int[arr.length];
		
		int maxLeftH = 0;
		int maxRightH = 0;
		
		int r = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(i == 0) {
				maxLeft[i] = 0;
				maxRight[j] = 0;
			}
			else {
				if(maxLeftH < arr[i]) {
					maxLeft[i] = arr[i];
					maxLeftH = arr[i];
				}else {
					maxLeft[i] = maxLeftH;
				}
				
				if(maxRightH < arr[j]) {
					maxRight[j] = arr[j];
					maxRightH = arr[j];
				}else {
					maxRight[i] = maxRightH;
				}
			}
			j--;
		}
		
		for(int i=0;i<arr.length;i++) {
			int tmp = Math.min(maxLeft[i], maxRight[i]) - arr[i];
			if(tmp>0) {				
				r += tmp;
			}
		}
		
		return r;
	}
	
	
	// it has O(N) running time (with additional O(N) memory complexity)
	// dynamic programming approach - memoization !!!
	public int solve(int[] heights) {
			
		// less than 3 bars can not trap any water
		if(heights.length < 3)
			return 0;
			
		// create arrays for the max left and right values
		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];
			
		// calculating the left max values (from left to right)
		leftMax[0] = 0;
			
		for(int i=1;i<leftMax.length;++i)
			leftMax[i] = Math.max(leftMax[i-1], heights[i-1]);
			
		// calculating the right max values (from right to left)
		rightMax[rightMax.length-1] = 0;
			
		for(int i=rightMax.length-2;i>=0;--i)
			rightMax[i] = Math.max(rightMax[i + 1], heights[i+1]);
			
		// consider all the items in O(N) running time
		int trapped = 0;
			
		for(int i=1;i<heights.length-1;i++)
			if(Math.min(leftMax[i], rightMax[i]) > heights[i])
				trapped += Math.min(leftMax[i], rightMax[i]) - heights[i];
			
		return trapped;
	}
}

















