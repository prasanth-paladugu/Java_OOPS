//CREATING A STUDENT CLASS WITH PROPERTIES/VARIBLES AND OPERATIONS/METHODS
class Student								//USER DEFINED CLASS
{
	int SNO;
	String NAME,COURCE,FACULTY,TIME;
	void setData()							// TASK/METHOD FOR SETTING DATA
	{
		SNO=01;
		NAME="PRASANTH";
		COURCE="CORE JAVA";
		TIME="11 TO 1";
		FACULTY="S.K";
	}
	void showData()							//TASK FOR GETTING DATA
	{
		System.out.println("SNO IS "+SNO);
		System.out.println("NAME IS "+NAME);
		System.out.println("COURCE IS "+COURCE);
		System.out.println("TIME IS "+TIME);
		System.out.println("FACULTY IS "+FACULTY);
	}
}
class TESTING3								//MAIN CLASS
{
	public static void main(String arg[])
	{
		Student s1=new Student();			//CREATING AN OBJECT WITH REFERENCE
		s1.setData();						//CALLING A METHOD FROM ANOTHER CLASS USING OBJECT
		s1.showData();
	}
}
