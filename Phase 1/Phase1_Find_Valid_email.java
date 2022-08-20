import java.util.Scanner;
import java.util.ArrayList;

public class Phase1_Find_Valid_email {
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the list : ");
		n=sc.nextInt();
		System.out.println();
		ArrayList <String> a =new ArrayList <String>();
		String str; 
		System.out.println("Enter the Email id's : ");
		for(int i=0;i<=n;i++)
	     { 
			 str = sc.nextLine();
			 a.add(str);
	     }
		System.out.println();
		String str2;
		System.out.println("Enter the Email id to be found : ");
		str2 = sc.nextLine();
		System.out.println();
		boolean ans = a.contains(str2);
		if (ans) 
		{
            System.out.println(str2 + " is present in the given list at the position  "+ a.indexOf(str2));
		}
        else
            System.out.println(str2+"  is not present");
	
		
	}
}
