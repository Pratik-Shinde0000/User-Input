//import java.lang.constant.ConstantDescs;
import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age =");
		int age = scan.nextInt();
		System.out.println("Your age =" + age);
		
		scan.nextLine();
		System.out.println("Enter your name =");
		String name = scan.nextLine();
		System.out.println("Your name =" + name);
		
		
		System.out.println("Enter your Gender =");
		char gender = scan.next().charAt(0);
		System.out.println("Your gender =" + gender);

		System.out.println("Enter your salary =");
		double salary = scan.nextDouble();
		System.out.println("your salary =" + salary);		

		scan.close();
	}

}
