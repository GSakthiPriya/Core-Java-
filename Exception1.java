class Exception1{
   public static void main(String args[]){
     try{
         int a[]=new int[7];
         a[0]=1;
	 a[1]=2;
	 a[3]=2/0;
	 a[8]=10;
	 System.out.println(a[0]);
         System.out.println("First print statement in try block");
     }
     catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
     finally{
	System.out.println("Finally");
	}
  }
}

