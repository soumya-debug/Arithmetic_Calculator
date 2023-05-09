package Main;
import java.util.Scanner;

public class arithmeticCalculator {

	public static int add(int n1, int n2)
	{
		int result = n1 + n2;
		return result;
	}
	public static int sub(int n1, int n2)
	{
		int result = n1 - n2;
		return result;
	}
	public static int mult(int n1, int n2)
	{
		int result = n1 * n2;
		return result;
	}
	public static int div(int n1, int n2)
	{
		int result = n1 / n2;
		return result;
	}
	public static int rim(int n1, int n2)
	{
		int result = n1 % n2;
		return result;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter first number:");
		n1 = sc.nextInt();
		System.out.println("Enter second number:");
		n2 = sc.nextInt();
		System.out.println("Enter your selection: 1 Addition(+), 2 Substraction(-), 3 Multiplication(*), 4 Division(/), 5 Reminder(%):");
		int choose;
		choose = sc.nextInt();

		switch (choose){
		case 1:
			System.out.println(add( n1,n2));
			break;
		case 2:
			System.out.println(sub( n1,n2));
			break;      
		case 3:
			System.out.println(mult( n1,n2));
			break;
		case 4:
			System.out.println(div( n1,n2));
			break;
		case 5:
			System.out.println(rim(n1, n2));
			break;
		default:
			System.out.println("Oops! Wrong choice, Please choose between 1 2 3 4 5");
		}


	} 


}

