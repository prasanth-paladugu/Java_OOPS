//CREATING A CLOCK CLASS FOR TESTING8 WITH ACESS MODIFIERS IN MATRIX STYLE
public class CLOCK								//USER DEFINED CLASS
{
	private int Hr,Min,Sec;						//DECLARING VARIABLES PRIVATELY
	public void setClock(int pos,int val)		//METHOD FOR SETING DATA IN MATRIX STYLE
	{
		switch(pos)
		{
			case 1:Hr=val;
			break;
			case 2:Min=val;
			break;
			case 3:Sec=val;
			break;
		}
	}
	public int getClock(int pos)				//METHOD FOR GETING DATA IN MATRIX STYLE
	{
		switch(pos)
		{
			case 1:return Hr;
			case 2:return Min;
			case 3:return Sec;
			default:return 0;
		}
	}
}