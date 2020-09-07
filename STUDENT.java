//CREATING A STUDENT CLASS FOR TESTING6 WITH ACCES MODIFIERS
public class STUDENT													//USER DEFINED CLASS
{
	private int SNO;
	private String NAME,COURCE,FACULTY,TIME;
	public void setData(int s,String n,String c,String f,String t)		//METHOD FOR SETTING DATA
	{
		SNO=s;
		NAME=n;
		COURCE=c;
		TIME=t;
		FACULTY=f;
	}
	public void showData()												//METHOD FOR SHOWING DATA
	{
		System.out.println("SNO IS "+SNO);
		System.out.println("NAME IS "+NAME);
		System.out.println("COURCE IS "+COURCE);
		System.out.println("TIME IS "+TIME);
		System.out.println("FACULTY IS "+FACULTY);
	}
}