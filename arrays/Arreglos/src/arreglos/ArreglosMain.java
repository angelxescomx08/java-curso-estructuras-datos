package arreglos;

import java.util.ArrayList;
import java.util.Arrays;

public class ArreglosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AguaRetenidad ar = new AguaRetenidad();
		int[] arr = {2,3};
		//int[] arr = {3,1,2,4,3,1,1,4};
		//int[] arr = {4,3,1,1,4};
		System.out.println("Mi solución: "+ar.resolver(arr) );
		System.out.println("La del otro man: "+ ar.resolver(arr) );
		System.out.println("La verdadera: "+ ar.resolver(arr) );
	}

}
