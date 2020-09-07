//CREATING A STUDENTB CLASS FOR TESTING7 WITH ACCES MODIFIERS IN BEAN STYLE
public class STUDENTB								//USER DEFINED CLASS
{
	private int SNO;
	private String NAME,COURCE,FACULTY,TIME;
	public void setSno(int s)						//METHODS FOR SETTING DATA INDIVIDUALLY FOE EACH VARIABLE
	{
		SNO=s;
	}
	public void setName(String n)
	{
		NAME=n;
	}
	public void setCource(String c)
	{
		COURCE=c;
	}
	public void setTime(String t)
	{
		TIME=t;
	}
	public void setFaculty(String f)
	{
		FACULTY=f;
	}
	public int getSno()							//METHODS FOR GETTING DATA INDIVIDUALLY FOE EACH VARIABLE
	{
		return SNO;
	}
	public String getName()
	{
		return NAME;
	}
	public String getCource()
	{
		return COURCE;
	}
	public String getTime()
	{
		return TIME;
	}
	public String getFaculty()
	{
		return FACULTY;
	}
}