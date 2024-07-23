import java.util.*;

public class Demo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Two Number");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println("The Addition of " + num1 + " and " + num2 + " is :" + (num1 + num2));
		}

	}

}
