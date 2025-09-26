package Week_4;
import java.util.Scanner;
public class Piecewise_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		int x;
		int y;
		System.out.print("Enter a value for x --> ");
		x = userinput.nextInt();
		userinput.nextLine();
		
		if (x < 0) {y = (3*x)+7;
			System.out.println("f(" + x + ") = " + y);}
		if ((x >= 0) && (x <= 10)) {y = (x*x)+8;
			System.out.println("f(" + x + ") = " + y);}
		if (x > 10) {y = (x*x*x)-(6*(x*x));
			System.out.println("f(" + x + ") = " + y);}
		
	}

}
