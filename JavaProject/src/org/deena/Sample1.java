package org.deena;

public class Sample1 {
	public static void main(String[] args) {
		
		int rows=6;
		for (int i = 1; i <=6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
