import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main() {
		System.out.println("Hello World");
		try{
			File file=new File("Car Details.txt");
		Scanner input=new Scanner(file);
		while(input.hasNextLine())
		{
			System.out.println(input);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
