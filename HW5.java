//EXAMPLE ON CALLING THE METHODS FROM ANOTHER PROGRAME WHICH IS WRITTEN IN BEAN STYLE
public class HW5
{
	public static void main(String arg[])
	{
		EMPLOYE s1=new EMPLOYE();								//CREATING A OBJECT AND ASSIGNING A REFERENCE
		s1.setId(01);											//CALLING METHODS WITH REFERENCE OBJECT
		s1.setName("PRASANTH");
		s1.setExp("4Y");
		s1.setDisg("JR.ENGINEER");
		s1.setSal(54879.00);
		System.out.println("ID IS "+s1.getId());
		System.out.println("NAME IS "+s1.getName());
		System.out.println("COURCE IS "+s1.getExp());
		System.out.println("FACULTY IS "+s1.getDisg());
		System.out.println("TIME IS "+s1.getSal());
	}
}