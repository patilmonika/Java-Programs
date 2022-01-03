//7.Java Program to Find Largest Number Among Three Numbers
package lesson1;

public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20, z = 30;
		
		if(x >= y && x >= z) {
			System.out.println(x+ "is largest number");
		}
		else if(y >= x && y >= z){
			System.out.println(y+ "is largest number");
		}
		else
			System.out.println(z+ "is largest number");
	}

}
