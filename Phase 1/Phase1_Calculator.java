import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
	int Option,a,b,result;
	Scanner sc = new Scanner(System.in);
	System.out.println("Simple Calculator Program");
	System.out.print("\n");
	System.out.println("Enter first number");
    a = sc.nextInt();
    System.out.println("Enter second number");
    b = sc.nextInt();
	System.out.println("Enter the Option [1-Addition ; 2-Subraction ; 3-Multiplication; 4-Division] :");
	Option =sc.nextInt();
	

    switch (Option) {

      
      case 1:
        result = a+b;
        System.out.println(a + " + " + b + " = " + result);
        break;

      case 2 :
        result = a-b;
        System.out.println(a + " - " + b + " = " + result);
        break;
        
      case 3 :
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;

      case 4 :
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    
  }
}
	
	
