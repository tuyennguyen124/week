import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;
		double weight;
		int feetTall;
		int inches;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		// System.out.print( "How tall are you? " );
		// height = keyboard.next();
		System.out.print("How many feet tall are you? ");
		feetTall = keyboard.nextInt();
		System.out.print("And how many inches? ");
		inches = keyboard.nextInt();
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + feetTall + "\'"+inches+"\'\' tall and " + weight + " heavy." );
	}
}