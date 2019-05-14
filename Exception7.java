class Exception7{
   public static void main(String args[]){
         int a[]=new int[7];
	try{
		try{
		 a[0]=1;
		 a[1]=2;
		 a[3]=2/0;
		}
		catch(ArithmeticException e){
		System.out.println("ArithmeticException");
	     	}


		try{
		 a[8]=10;
	     	}
	   	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(" ArrayIndexOutOfBoundsException");
		}
	String s=null;
	System.out.println(s.charAt(0));
	}
	catch(NullPointerException e){
	System.out.println("NullPointerException");
	}	
  }
}
