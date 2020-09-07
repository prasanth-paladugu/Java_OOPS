//CREATING A CLOCKN CLASS FOR TESTING9 WITH ACESS MODIFIERS IN MATRIX STYLE
public class CLOCKN									//USER DEFINED CLASS
{
	private int Hr,Min,Sec;							//DECLARING THE VARIABLES PRIVATELY
	public void setClock(String pos,int val)		//METHOD FOR SETTING DATA IN MATRIX STYLE
	{
		switch(pos)
		{
			case "hr":Hr=val;
			break;
			case "min":Min=val;
			break;
			case "sec":Sec=val;
			break;
		}
	}
	public int getClock(String pos)					//METHOD FOR GETING DATA IN MATRIX STYLE
	{
		switch(pos)
		{
			case "hr":return Hr;
			case "min":return Min;
			case "sec":return Sec;
			default:return 0;
		}
	}
}