import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
class Exception5{
	public static void main(String args[])
	{
		try{
		File file=new File("/home/test/Desktop/sakthi.txt");
		FileReader r=new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception caught");
		}
	}
}
