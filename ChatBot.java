import java.util.Scanner;

public class ChatBot
{
	
	public static void main(String[] args)
	{	
		//
		//
		Scanner keyboard = new Scanner(System.in);
			
		String input = keyboard.nextLine();
		System.out.println("Hi " + input + "! How are you doing?");
		input = keyboard.nextLine();
		System.out.println("I am glad that you are " + input);
		while(!input.equals("bye")&&!input.equals("Bye"))
		{
			System.out.println("What do you want to talk about: ");
			input = keyboard.nextLine();
			if(input.equals("gainz"))
			{
				System.out.println("ayy lmao, you right");
			}
			else if(!input.equals("bye")&&!input.equals("Bye"))
			{
				System.out.println("LOL, " + input + " is stupid, lets talk about something else");
			}
			
		}
		System.out.println("Ayy lmao, we out");
		
		}
}
		
		
