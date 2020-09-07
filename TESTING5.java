//CREATING A EMPLOYE CLASS WITH PROPERTIES/VARIBLES AND OPERATIONS/METHODS WITH DYNAMIC DATA
import java.util.Scanner;
class EMPLOYE												//USER DEFINED CLASS
{
	int ID;													//DECLARING PROPERTIES
	String NAME,DESIGNATION,EXPERIENCE;
	double SALERY;
	void setData(int i,String n,String d,String e,double s)	//METHOD FOR SETTING DATA
	{
		ID=i;
		NAME=n;
		DESIGNATION=d;
		EXPERIENCE=e;
		SALERY=s;
	}
	void showData()											//METHOD FOR GETTING DATA
	{
		System.out.println("ID IS "+ID);
		System.out.println("NAME IS "+NAME);
		System.out.println("DESIGNATION IS "+DESIGNATION);
		System.out.println("EXPERIENCE IS "+EXPERIENCE);
		System.out.println("SALERY IS "+SALERY);
	}
}
class TESTING5												//MAIN CLASS
{
	public static void main(String arg[])
	{
		EMPLOYE e1=new EMPLOYE();								//CREATING AN OBJECT WITH REFERENCE
		e1.setData(01,"PRASANTH","ENGINEER","11 TO 12",50000);	//CALLING A METHOD FROM ANOTHER CLASS AND ASSIGNING DYNAMIC VAUES
		e1.showData();
		EMPLOYE s2=new EMPLOYE();//CREATING A OBJECT
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER SNO NAME COURCE TIME FACULTY ");
		int i=input.nextInt();
		String n=input.next();
		String d=input.next();
		String e=input.next();
		double s=input.nextDouble();
		s2.setData(i,n,d,e,s);									//CALLING A METHOD FROM ANOTHER CLASS
		s2.showData();

	}
}
