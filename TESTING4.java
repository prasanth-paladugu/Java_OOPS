//CREATING A STUDENT CLASS WITH PROPERTIES/VARIBLES AND OPERATIONS/METHODS WITH DYNAMIC DATA
import java.util.Scanner;									//GIVING THE ADDRESS OF SCANNER CLASS TO COMPLIER
class Student												//USER DEFINED METHOD
{
	int SNO;
	String NAME,COURCE,FACULTY,TIME;
	void setData(int s,String n,String c,String f,String t)	//METHOD FOR SETTING DATA
	{
		SNO=s;
		NAME=n;
		COURCE=c;
		TIME=t;
		FACULTY=f;
	}
	void showData()											//METHOD FOR GETTING DATA
	{
		System.out.println("SNO IS "+SNO);
		System.out.println("NAME IS "+NAME);
		System.out.println("COURCE IS "+COURCE);
		System.out.println("TIME IS "+TIME);
		System.out.println("FACULTY IS "+FACULTY);
	}
}
class TESTING4												//MAIN METHOD
{
	public static void main(String arg[])
	{
		Student s1=new Student();							//CREATING AN OBJECT WITH REFERENCE
		s1.setData(01,"PRASANTH","CORE JAVA","SK","11 TO 1");//CALLING A METHOD FROM ANOTHER CLASS AND ASSIGNING DYNAMIC VAUES
		s1.showData();
		Student s2=new Student();							//CREATING A OBJECT WITH REFERENCE
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER SNO NAME COURCE TIME FACULTY ");
		int s=input.nextInt();
		String n=input.next();
		String c=input.next();
		String f=input.next();
		String t=input.next();
		s2.setData(s,n,c,f,t);								//CALLING A METHOD FROM ANOTHER CLASS
		s2.showData();

	}
}
