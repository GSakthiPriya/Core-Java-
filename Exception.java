class Exception{
	public static void main(String args[]){
 		int n1,n2,n3;
		try{
 		n1=0;
 		n2=10;
 		n3=n2/n1;
 		System.out.println(n3);
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide a number by zero");
		}

	}
}

