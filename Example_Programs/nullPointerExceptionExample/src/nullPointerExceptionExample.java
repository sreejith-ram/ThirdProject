import java.util.Scanner;

public class nullPointerExceptionExample {

	public static void main(String[] args) 
	{
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the String: ");
		s=sc.next();
		try
		{
			s.length();
			System.out.println(s.length());
		}
		catch (Exception ne)
		{
			System.out.println(ne.getMessage());
		}	
		

	}

}
