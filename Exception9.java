class Exception9 
{ 
	static void fun() throws NullPointerException
	{ 
		System.out.println("Caught inside fun(). "); 
		throw new NullPointerException("demo"); 
	} 
	public static void main(String args[]) 
	{ 
		try
		{ 
			fun(); 
		} 
		catch(NullPointerException e) 
		{ 
			System.out.println("caught in main."); 
		} 
	} 
} 

