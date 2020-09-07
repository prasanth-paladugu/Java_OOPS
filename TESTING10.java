//FINAL EXAMPLE ON TYPES OF ACESS MODIFIERS
public class TESTING10
{
	public static void main(String[]args)
	{
		SAMPLE s1=new SAMPLE();
		//System.out.println("A"+s1.a);	//PRIVATE VARIABLE CANNOT BE ACCESED IN OTHER CLASS
		System.out.println("B "+s1.b);	//DEFAULT VARIABLE CAN BE ACCESSED WITH IN THE FOLDER
		System.out.println("C "+s1.c);	//PROTECTED VARIABLE CAN BE ACESSED WITH IN THE FOLDER AMD AND OTHER CLASSES WITH RELATION
		System.out.println("D "+s1.d);	//PUBLIC CAN BE ACCESSED ANYWHERE
	}
}