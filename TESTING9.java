//EXAMPLE ON CALLING A CLOCK CLASS CREATED BY USING ACCESS MODIFIER IN MATRIX CLASS
public class TESTING9
{
	public static void main(String[]args)
	{
		CLOCKN c1=new CLOCKN();
		c1.setClock("hr",10);									//SETTING METHODS FOR ASSIGNING VALUES IN MATRIX STYLE
		c1.setClock("min",59);
		c1.setClock("sec",3);
		System.out.println("HOURS "+c1.getClock("hr"));			//GETTING METHODS FOR ABSTRACTING VALUES IN MATRIX STYLE
		System.out.println("MINUTES "+c1.getClock("min"));
		System.out.println("SECONDS "+c1.getClock("sec"));
	}
}

