public class toystorer
{
	public static void main(String[]args)
	{
		
		toystore t = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(t);
		System.out.println(t.getFToy());
		System.out.println(t.getFType());
	}
}