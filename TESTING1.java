//CREATING A CLASS WITH SOME PROPERTIES
class Human										//USER DEFINED CLASS
{
	int age;
	double height;
	String name;
}
class TESTING1
{
	public static void main(String arg[])		//MAIN CLASS
	{
		//age=10;								//VARIABLE OF ANOTHER CLASS CANNOT BE DECLARED DIRECTLY
		//Human.age;							//IT IS CORRECT WHEN VARIABLES ARE STATIC
		Human pp=new Human();					//CREATING A OBJECT
		pp.name="PRASANTH";						//SETTING DATA FOR A VARIABLE OF ANOTHER CLASS USING OBJECT
		pp.age=22;
		pp.height=5.8;
		System.out.println("NAME\t\tAGE\tHEIGHT\n"+pp.name+"\t"+pp.age+"\t"+pp.height);	//'\t' IS FOR TAB SPACE
	}
}
