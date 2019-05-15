
public class Mem{

	public static void main(String[] args) {
		try{
		Integer[] array = new Integer[1000*1000*100];
		System.out.println("Done");
		}
		catch(OutOfMemoryError e)
		{
		System.out.println("Out of Memory exception");
		}	
	}

}


