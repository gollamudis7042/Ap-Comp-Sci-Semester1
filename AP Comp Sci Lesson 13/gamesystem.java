public class gamesystem
{
	private String platform;
	private int serial;
	
	public gamesystem()
	{
		platform="";
		serial=(int)(Math.random() * 1000000) + 1;
	}
	
	public gamesystem(String p)
	{
		serial=(int)(Math.random() * 1000000) + 1;
		platform=p;
	}
	
	public int getS()
	{
		return serial;
	}
	
	public String getP()
	{
		return platform;
	}
}