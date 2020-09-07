//EXAMPLE ON CALLING A CLOCK CLASS CREATED BY USING ACCESS MODIFIER IN MATRIX CLASS
public class TESTING8
{
	public static void main(String[]args)
	{
		CLOCK c1=new CLOCK();							//OBJECT 1
		c1.setClock(1,10);								//SETTING METHODS FOR ASSIGINING VALUES IN MATRIX STYLE
		c1.setClock(2,59);
		c1.setClock(3,3);
		System.out.println("HOURS "+c1.getClock(1));	//SETTING METHODS FOR ABSTRACTING VALUES IN MATRIX STYLE
		System.out.println("MINUTES "+c1.getClock(2));
		System.out.println("SECONDS "+c1.getClock(3));
		CLOCK c2=new CLOCK();							//OBJECT 2
		c2.setClock(1,11);
		c2.setClock(2,01);
		c2.setClock(3,59);
		System.out.printf("%02d:%02d:%02d\n",c2.getClock(1),c2.getClock(2),c2.getClock(3)); //TAKEN FROM C LANGUAGE
	}
}

