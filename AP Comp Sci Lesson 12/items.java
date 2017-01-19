public class items
{
	private String m,n,c,p;
	private int upc=(int)(Math.random() * 1000000) + 1;
	
	public items(String mm, String nn)
	{
		m=mm;
		n=nn;
		c="Unknown";
		p="Unknown";
	}
	
	public items(String mm, String nn, String cc, String pp)
	{
		m=mm;
		n=nn;
		c=cc;
		p=pp;
	}
	
	public String toString()
	{
		return "Item\nManufacturer: " + m +
                           "\nName: " + n +
                           "\nCategory: " + c +
                           "\nPrice: " + p+
						   "\nUPC:" + upc;
	}
}