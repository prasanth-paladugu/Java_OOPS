//CREATING A MOVIE CLASS FOR HW6 WITH ACESS MODIFIERS IN MATRIX STYLE
public class MOVIE
{
	private String H,Hin,Dire,Vil;
	public void setMovie(String who,String name) 	//CREATING A METHOD IN MATRIX STYLE FOR SETTING VALUES
	{
		switch(who)
		{
			case "h":H=name;
			break;
			case "dire":Dire=name;
			break;
			case "vil":Vil=name;
			break;
			case "hin":Hin=name;
			break;
		}
	}
	public String getMovie(String who)				//CREATING A METHOD IN MATRIX STYLE FOR GETTING VALUES
	{
		switch(who)
		{
			case "h":return H;
			case "dire":return Dire;
			case "vil":return Vil;
			case "hin":return Hin;
			default:return "None";
		}
	}
}