import java.util.ArrayList;
public class toystore
{
	ArrayList<toy> ts = new ArrayList<toy>();
	
	public toystore()
	{
		ts.add(new afigure(""));
		ts.add(new car(""));
	}
	
	public toystore(String list)
	{
		loadT(list);
	}
	
	public void loadT(String list)
	{
		String[] s = list.split(", ");
		
		for(int i=0;i<s.length;i+=2)
		{
			String name = s[i];
			String type = s[i+1];
			
			if(getToy(name)==null)
			{
				if(type.equals("car"))
					ts.add(new car(name));
				if(type.equals("action figure"))
					ts.add(new afigure(name));
			}
			else
				getToy(name).setC(1);
		}
	}
	
	public toy getToy(String n)
	{
		for(toy b: ts)
		{
			if(b.getN().equals(n))
				return b;
		}
		return null;
	}
	public String getFToy()
	{
		String name="";
		int max=0;
		for(toy b: ts)
		{
			if(max<b.getC())
			{
				max=b.getC();
				name=b.getN();
			}	
		}
		return name;
	}
	
	public String getFType()
	{
		int cars=0;
		int f=0;
		
		for(toy b: ts)
		{
			if(b.getT().equals("action figure"))
				f+=1;
			if(b.getT().equals("car"))
				cars+=1;
		}
		if(cars>f)
			return "cars";
		if(f>cars)
			return "f";
		else
			return "equal amount of cars and action figures";
	}
	
	public String toString()
	{
		String s="";
		for(toy b: ts)
		{
			s+=b.getN()+" ";
			s+=b.getC()+" ";
		}		
		return s;		
	}
	
}