//EXAMPLE ON CALLING A CLOCK CLASS CREATED BY USING ACCESS MODIFIER IN MATRIX CLASS
public class HW6
{
	public static void main(String[]args)
	{
		MOVIE c1=new MOVIE();
		c1.setMovie("h","NTR");								//MATRIX STYLE OF ASSIGNING VALUES TO VARIABLE IN ANOTHER CLASS
		c1.setMovie("hin","THOMAS");
		c1.setMovie("dire","BOBY");
		c1.setMovie("vil","NTR");
		System.out.println("HERO IS "+c1.getMovie("h")); 	//MATRIX STYLE OF GETTINING VALUES OF VARIABLE IN ANOTHER CLASS
		System.out.println("HEROIN IS "+c1.getMovie("hin"));
		System.out.println("DIRECTOR IS "+c1.getMovie("dire"));
		System.out.println("VILLAN IS "+c1.getMovie("vil"));
	}
}

