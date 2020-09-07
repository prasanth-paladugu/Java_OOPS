//EXAMPLE ON CALLING THE METHODS FROM ANOTHER PROGRAME BEAN STYLE
public class TESTING7
{
	public static void main(String args[])
	{
		STUDENTB s1=new STUDENTB();								//CREATING AN OBJECT WITH RFFERENCE
		s1.setSno(01);											//METHODS FOR SETTING DATA
		s1.setName("PRASANTH");
		s1.setCource("CORE JAVA");
		s1.setFaculty("SK");
		s1.setTime("11 TO 1");
		System.out.println("SNO IS "+s1.getSno());				//METHODS FFOR GETTING DATA
		System.out.println("NAME IS "+s1.getName());
		System.out.println("COURCE IS "+s1.getCource());
		System.out.println("FACULTY IS "+s1.getFaculty());
		System.out.println("TIME IS "+s1.getTime());
		STUDENTB s2=new STUDENTB();								//CREATING AN OBJECT WITH REFERENCE
		s2.setSno(02);
		s2.setName("PANDU");
		s2.setCource("C");
		s2.setFaculty("SK");
		s2.setTime("4 TO 6");
		System.out.println("Student Details are" );
		System.out.println(s2.getSno()+"\t"+s2.getName()+"\t"+s2.getCource()+"\t"+s2.getFaculty()+"\t"+s2.getTime());
	}
}