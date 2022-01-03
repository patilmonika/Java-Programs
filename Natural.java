//9.Java Program to Calculate Sum of Natural Numbers
package lesson1;

public class Natural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100, sum = 0;
		for(int i = 1; i <= num ; ++i)
		{
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}

}
