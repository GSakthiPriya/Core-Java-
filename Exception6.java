class Exception6{
	public static void main(String args[])
	{
		try{
		int n=Integer.parseInt("abcd");
		System.out.println(n);		
		}
		catch(NumberFormatException e)
		{
		System.out.println("Number Format Exception");	
		}
	}
}
