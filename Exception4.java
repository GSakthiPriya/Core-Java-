class Exception4 
{ 
    public static void main(String args[]) 
    { 
        try { 
            String a = "hi"; 
            char c = a.charAt(2); 
            //System.out.println(c);
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println(" this is StringIndexOutOfBoundsException"); 
        } 
    } 
}
