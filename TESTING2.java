//CREATING A CLASS WITH TASK/OPERATION/METHOD
class Human									//USER DEFINED CLASS
{
	void eat()								//TASK 1
	{
		System.out.println("EATING");
	}
	void talk()								//TASK 2
	{
		System.out.println("TALKING");
	}
	void sleep()							//TASK 3
	{
		System.out.println("SLEEPING");
	}
}
class TESTING2								//MAIN CLASS
{
	public static void main(String arg[])
	{
		Human pp;							//CREATING A REFERENCE FOR OBJECT
		pp=new Human();						//CREATING A OBJECT WITH 'pp' REFERNCE
		pp.eat();							//CALLING THE METHOD FROM ANOTHER CLASS USING OBJECT
		pp.talk();
		pp.sleep();
	}
}