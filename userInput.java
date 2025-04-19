import java.util.*;


public class userInput {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in); //Here Scanner is class of Util package and sc is the object of the class
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter first number : ");
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2;
		
		System.out.println("Your sum is : " + num3);
	}

}
